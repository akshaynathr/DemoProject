package model.EO;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.DBSequence;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Aug 16 22:46:50 IST 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ProductEOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        ProductId,
        ProductName,
        ProductDescription,
        CurrentPrice,
        ProductCategoryId,
        CreatedBy,
        CreatedOn,
        LastUpdatedBy,
        LastUpdatedOn,
        VersionNo,
        IsActive;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        protected int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int PRODUCTID = AttributesEnum.ProductId.index();
    public static final int PRODUCTNAME = AttributesEnum.ProductName.index();
    public static final int PRODUCTDESCRIPTION = AttributesEnum.ProductDescription.index();
    public static final int CURRENTPRICE = AttributesEnum.CurrentPrice.index();
    public static final int PRODUCTCATEGORYID = AttributesEnum.ProductCategoryId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDON = AttributesEnum.CreatedOn.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDON = AttributesEnum.LastUpdatedOn.index();
    public static final int VERSIONNO = AttributesEnum.VersionNo.index();
    public static final int ISACTIVE = AttributesEnum.IsActive.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ProductEOImpl() {
    }

    /**
     * Gets the attribute value for ProductId, using the alias name ProductId.
     * @return the value of ProductId
     */
    public DBSequence getProductId() {
        return (DBSequence) getAttributeInternal(PRODUCTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProductId.
     * @param value value to set the ProductId
     */
    public void setProductId(DBSequence value) {
        setAttributeInternal(PRODUCTID, value);
    }

    /**
     * Gets the attribute value for ProductName, using the alias name ProductName.
     * @return the value of ProductName
     */
    public String getProductName() {
        return (String) getAttributeInternal(PRODUCTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProductName.
     * @param value value to set the ProductName
     */
    public void setProductName(String value) {
        setAttributeInternal(PRODUCTNAME, value);
    }

    /**
     * Gets the attribute value for ProductDescription, using the alias name ProductDescription.
     * @return the value of ProductDescription
     */
    public String getProductDescription() {
        return (String) getAttributeInternal(PRODUCTDESCRIPTION);
    }

    /**
     * Gets the attribute value for CurrentPrice, using the alias name CurrentPrice.
     * @return the value of CurrentPrice
     */
    public BigDecimal getCurrentPrice() {
        return (BigDecimal) getAttributeInternal(CURRENTPRICE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CurrentPrice.
     * @param value value to set the CurrentPrice
     */
    public void setCurrentPrice(BigDecimal value) {
        setAttributeInternal(CURRENTPRICE, value);
    }

    /**
     * Gets the attribute value for ProductCategoryId, using the alias name ProductCategoryId.
     * @return the value of ProductCategoryId
     */
    public Long getProductCategoryId() {
        return (Long) getAttributeInternal(PRODUCTCATEGORYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProductCategoryId.
     * @param value value to set the ProductCategoryId
     */
    public void setProductCategoryId(Long value) {
        setAttributeInternal(PRODUCTCATEGORYID, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public String getCreatedBy() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Gets the attribute value for CreatedOn, using the alias name CreatedOn.
     * @return the value of CreatedOn
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) getAttributeInternal(CREATEDON);
    }

    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the value of LastUpdatedBy
     */
    public String getLastUpdatedBy() {
        return (String) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Gets the attribute value for LastUpdatedOn, using the alias name LastUpdatedOn.
     * @return the value of LastUpdatedOn
     */
    public Timestamp getLastUpdatedOn() {
        return (Timestamp) getAttributeInternal(LASTUPDATEDON);
    }

    /**
     * Gets the attribute value for VersionNo, using the alias name VersionNo.
     * @return the value of VersionNo
     */
    public Long getVersionNo() {
        return (Long) getAttributeInternal(VERSIONNO);
    }

    /**
     * Gets the attribute value for IsActive, using the alias name IsActive.
     * @return the value of IsActive
     */
    public String getIsActive() {
        return (String) getAttributeInternal(ISACTIVE);
    }

    /**
     * Sets <code>value</code> as the attribute value for IsActive.
     * @param value value to set the IsActive
     */
    public void setIsActive(String value) {
        setAttributeInternal(ISACTIVE, value);
    }

    /**
     * @param productId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(DBSequence productId) {
        return new Key(new Object[] { productId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EO.ProductEO");
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
    }

    /**
     * Add entity remove logic in this method.
     */
    @Override
    public void remove(){
        setIsActive("n");
        super.remove();
        
        }
    
    @Override
    protected void doDML(int operation,TransactionEvent e) {
        if(operation==DML_DELETE){
            operation=DML_UPDATE;
            
            }
        super.doDML(operation, e);
        
        }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
   
}
