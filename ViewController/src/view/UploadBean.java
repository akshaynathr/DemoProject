package view;

import javax.faces.event.ValueChangeEvent;

import oracle.adf.model.BindingContext;

import oracle.adf.view.rich.component.rich.data.RichColumn;
import oracle.adf.view.rich.util.ResetUtils;

import oracle.binding.BindingContainer;

import oracle.binding.OperationBinding;

import org.apache.myfaces.trinidad.model.UploadedFile;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import oracle.adf.view.rich.component.rich.input.RichInputText;
import java.io.File;

import java.nio.file.Files;

import java.nio.file.Path;

import java.nio.file.Paths;

public class UploadBean {
    

    public UploadBean() {
    }
    private static String filePath;
    Long docId;
    Long OppId;
    private RichInputText it;


    public static void setFilePath(String filePath) {
        UploadBean.filePath = filePath;
    }

    public static String getFilePath() {
        return filePath;
    }

    public void setDocId(Long docId) {
        this.docId = docId;
    }

    public Long getDocId() {
        return docId;
    }

    public void setOppId(Long OppId) {
        this.OppId = OppId;
    }

    public Long getOppId() {
        return OppId;
    }

    public void setIt(RichInputText it) {
        this.it = it;
    }

    public RichInputText getIt() {
        return it;
    }

    public void uploadFileVCE(ValueChangeEvent vce) {
                if (vce.getNewValue() != null) {
                    //Get File Object from VC Event
                    UploadedFile fileVal = (UploadedFile) vce.getNewValue();
                    //Upload File to path- Return actual server path
                    String path = uploadFile(fileVal);
                    
                    //Method to insert data in table to keep track of uploaded files
            BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
            OperationBinding ob = bindings.getOperationBinding("setFileData"); 
                    
                //    OperationBinding ob = executeOperation("setFileData");
                                    ob.getParamsMap().put("docId", docId);
                                    ob.getParamsMap().put("opptId",  OppId);
                    ob.getParamsMap().put("name", fileVal.getFilename());
                    ob.getParamsMap().put("path", path);
                    
                    
                    ob.execute();
                    
                    // Reset inputFile component after upload
                    ResetUtils.reset(vce.getComponent());
                    
                }
            }
    
    
    
    /*Method to upload file to actual path on Server*/
           
           private String uploadFile(UploadedFile file) {

               UploadedFile myfile = file;
               String path = null;
               if (myfile == null) {

               } else {
                   // All uploaded files will be stored in below path
                   path = "D://FileStore//" + myfile.getFilename();
                   InputStream inputStream = null;
                   try {
                       FileOutputStream out = new FileOutputStream(path);
                       inputStream = myfile.getInputStream();
                       byte[] buffer = new byte[8192];
                       int bytesRead = 0;
                       while ((bytesRead = inputStream.read(buffer, 0, 8192)) != -1) {
                           out.write(buffer, 0, bytesRead);
                       }
                       out.flush();
                       out.close();
                   } catch (Exception ex) {
                       // handle exception
                       ex.printStackTrace();
                   } finally {
                       try {
                           inputStream.close();
                       } catch (IOException e) {
                       }
                   }

               }
               //Returns the path where file is stored
               return path;
           }
           
           
           
           
           /*Method to download file from actual path
         * @param facesContext
         * @param outputStream
         */
        public void downloadFileListener(FacesContext facesContext, OutputStream outputStream) throws IOException {
            //Read file from particular path, path bind is binding of table field that contains path
        System.out.println("abcdef");
        System.out.println("ghijkl"+it.getValue().toString());
        File filed = new File(it.getValue().toString());
            FileInputStream fis;
            byte[] b;
            try {
                fis = new FileInputStream(filed);

                int n;
                while ((n = fis.available()) > 0) {
                    b = new byte[n];
                    int result = fis.read(b);
                    outputStream.write(b, 0, b.length);
                    if (result == -1)
                        break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            outputStream.flush();
 
 
        }
        
        
        
        
        
    public BindingContainer getBindings() {
            return BindingContext.getCurrent().getCurrentBindingsEntry();
        }
        
            
             public String deleteFile(){
                     System.out.println("path: "+it.getValue().toString());
            filePath = it.getValue().toString();
            System.out.println(filePath);
            BindingContainer bindings = getBindings();
            OperationBinding operationBinding = bindings.getOperationBinding("Delete");
            Object result = operationBinding.execute();
            if (!operationBinding.getErrors().isEmpty()) {
                return null;
            }
                            return null;
        }
            
            public String commitFile(){
                BindingContainer bindings = getBindings();
        OperationBinding operationBinding2 = bindings.getOperationBinding("Commit");
        Object result2 = operationBinding2.execute();
        if (!operationBinding2.getErrors().isEmpty()) {
            return null;
        }
                   Path delPath = Paths.get(filePath);
            try {
                Files.delete(delPath);
            } catch (IOException e) {
            }
        return null;
        }

   
}
