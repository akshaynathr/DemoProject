package model.UVO;

import java.sql.Timestamp;

import model.EO.UserEOImpl;

import oracle.jbo.Row;
import oracle.jbo.RowSet;
import oracle.jbo.domain.DBSequence;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Aug 17 18:12:56 IST 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class UserRolesMasterVORowImpl extends ViewRowImpl {

    public static final int ENTITY_USEREO = 0;
    public static final int ENTITY_ROLEEO = 1;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        CreatedBy,
        CreatedOn,
        EndDate,
        FirstName,
        GlobalUsername,
        IsActive,
        LastName,
        LastUpdatedBy,
        LastUpdatedOn,
        MiddleName,
        Password,
        StartDate,
        SupervisorId,
        TeamId,
        UserId,
        VersionNo,
        CreatedBy1,
        CreatedOn1,
        Description,
        EndDate1,
        IsActive1,
        LastUpdatedBy1,
        LastUpdatedOn1,
        RoleId,
        RoleNameId,
        StartDate1,
        VersionNo1,
        AreAssociated,
        UsersRolesUVO1,
        RoleNameLookupVO1,
        RoleNameLookup1;
        private static AttributesEnum[] vals = null;
        ;
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


    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDON = AttributesEnum.CreatedOn.index();
    public static final int ENDDATE = AttributesEnum.EndDate.index();
    public static final int FIRSTNAME = AttributesEnum.FirstName.index();
    public static final int GLOBALUSERNAME = AttributesEnum.GlobalUsername.index();
    public static final int ISACTIVE = AttributesEnum.IsActive.index();
    public static final int LASTNAME = AttributesEnum.LastName.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDON = AttributesEnum.LastUpdatedOn.index();
    public static final int MIDDLENAME = AttributesEnum.MiddleName.index();
    public static final int PASSWORD = AttributesEnum.Password.index();
    public static final int STARTDATE = AttributesEnum.StartDate.index();
    public static final int SUPERVISORID = AttributesEnum.SupervisorId.index();
    public static final int TEAMID = AttributesEnum.TeamId.index();
    public static final int USERID = AttributesEnum.UserId.index();
    public static final int VERSIONNO = AttributesEnum.VersionNo.index();
    public static final int CREATEDBY1 = AttributesEnum.CreatedBy1.index();
    public static final int CREATEDON1 = AttributesEnum.CreatedOn1.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int ENDDATE1 = AttributesEnum.EndDate1.index();
    public static final int ISACTIVE1 = AttributesEnum.IsActive1.index();
    public static final int LASTUPDATEDBY1 = AttributesEnum.LastUpdatedBy1.index();
    public static final int LASTUPDATEDON1 = AttributesEnum.LastUpdatedOn1.index();
    public static final int ROLEID = AttributesEnum.RoleId.index();
    public static final int ROLENAMEID = AttributesEnum.RoleNameId.index();
    public static final int STARTDATE1 = AttributesEnum.StartDate1.index();
    public static final int VERSIONNO1 = AttributesEnum.VersionNo1.index();
    public static final int AREASSOCIATED = AttributesEnum.AreAssociated.index();
    public static final int USERSROLESUVO1 = AttributesEnum.UsersRolesUVO1.index();
    public static final int ROLENAMELOOKUPVO1 = AttributesEnum.RoleNameLookupVO1.index();
    public static final int ROLENAMELOOKUP1 = AttributesEnum.RoleNameLookup1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public UserRolesMasterVORowImpl() {
    }

    /**
     * Gets UserEO entity object.
     * @return the UserEO
     */
    public UserEOImpl getUserEO() {
        return (UserEOImpl) getEntity(ENTITY_USEREO);
    }

    /**
     * Gets RoleEO entity object.
     * @return the RoleEO
     */
    public EntityImpl getRoleEO() {
        return (EntityImpl) getEntity(ENTITY_ROLEEO);
    }


    /**
     * Gets the attribute value for CREATED_BY using the alias name CreatedBy.
     * @return the CREATED_BY
     */
    public String getCreatedBy() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Gets the attribute value for CREATED_ON using the alias name CreatedOn.
     * @return the CREATED_ON
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) getAttributeInternal(CREATEDON);
    }

    /**
     * Gets the attribute value for END_DATE using the alias name EndDate.
     * @return the END_DATE
     */
    public Timestamp getEndDate() {
        return (Timestamp) getAttributeInternal(ENDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for END_DATE using the alias name EndDate.
     * @param value value to set the END_DATE
     */
    public void setEndDate(Timestamp value) {
        setAttributeInternal(ENDDATE, value);
    }

    /**
     * Gets the attribute value for FIRST_NAME using the alias name FirstName.
     * @return the FIRST_NAME
     */
    public String getFirstName() {
        return (String) getAttributeInternal(FIRSTNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for FIRST_NAME using the alias name FirstName.
     * @param value value to set the FIRST_NAME
     */
    public void setFirstName(String value) {
        setAttributeInternal(FIRSTNAME, value);
    }

    /**
     * Gets the attribute value for GLOBAL_USERNAME using the alias name GlobalUsername.
     * @return the GLOBAL_USERNAME
     */
    public String getGlobalUsername() {
        return (String) getAttributeInternal(GLOBALUSERNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for GLOBAL_USERNAME using the alias name GlobalUsername.
     * @param value value to set the GLOBAL_USERNAME
     */
    public void setGlobalUsername(String value) {
        setAttributeInternal(GLOBALUSERNAME, value);
    }

    /**
     * Gets the attribute value for IS_ACTIVE using the alias name IsActive.
     * @return the IS_ACTIVE
     */
    public String getIsActive() {
        return (String) getAttributeInternal(ISACTIVE);
    }

    /**
     * Sets <code>value</code> as attribute value for IS_ACTIVE using the alias name IsActive.
     * @param value value to set the IS_ACTIVE
     */
    public void setIsActive(String value) {
        setAttributeInternal(ISACTIVE, value);
    }

    /**
     * Gets the attribute value for LAST_NAME using the alias name LastName.
     * @return the LAST_NAME
     */
    public String getLastName() {
        return (String) getAttributeInternal(LASTNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_NAME using the alias name LastName.
     * @param value value to set the LAST_NAME
     */
    public void setLastName(String value) {
        setAttributeInternal(LASTNAME, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @return the LAST_UPDATED_BY
     */
    public String getLastUpdatedBy() {
        return (String) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Gets the attribute value for LAST_UPDATED_ON using the alias name LastUpdatedOn.
     * @return the LAST_UPDATED_ON
     */
    public Timestamp getLastUpdatedOn() {
        return (Timestamp) getAttributeInternal(LASTUPDATEDON);
    }

    /**
     * Gets the attribute value for MIDDLE_NAME using the alias name MiddleName.
     * @return the MIDDLE_NAME
     */
    public String getMiddleName() {
        return (String) getAttributeInternal(MIDDLENAME);
    }

    /**
     * Sets <code>value</code> as attribute value for MIDDLE_NAME using the alias name MiddleName.
     * @param value value to set the MIDDLE_NAME
     */
    public void setMiddleName(String value) {
        setAttributeInternal(MIDDLENAME, value);
    }

    /**
     * Gets the attribute value for PASSWORD using the alias name Password.
     * @return the PASSWORD
     */
    public String getPassword() {
        return (String) getAttributeInternal(PASSWORD);
    }

    /**
     * Sets <code>value</code> as attribute value for PASSWORD using the alias name Password.
     * @param value value to set the PASSWORD
     */
    public void setPassword(String value) {
        setAttributeInternal(PASSWORD, value);
    }

    /**
     * Gets the attribute value for START_DATE using the alias name StartDate.
     * @return the START_DATE
     */
    public Timestamp getStartDate() {
        return (Timestamp) getAttributeInternal(STARTDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for START_DATE using the alias name StartDate.
     * @param value value to set the START_DATE
     */
    public void setStartDate(Timestamp value) {
        setAttributeInternal(STARTDATE, value);
    }

    /**
     * Gets the attribute value for SUPERVISOR_ID using the alias name SupervisorId.
     * @return the SUPERVISOR_ID
     */
    public Long getSupervisorId() {
        return (Long) getAttributeInternal(SUPERVISORID);
    }

    /**
     * Sets <code>value</code> as attribute value for SUPERVISOR_ID using the alias name SupervisorId.
     * @param value value to set the SUPERVISOR_ID
     */
    public void setSupervisorId(Long value) {
        setAttributeInternal(SUPERVISORID, value);
    }

    /**
     * Gets the attribute value for TEAM_ID using the alias name TeamId.
     * @return the TEAM_ID
     */
    public Integer getTeamId() {
        return (Integer) getAttributeInternal(TEAMID);
    }

    /**
     * Sets <code>value</code> as attribute value for TEAM_ID using the alias name TeamId.
     * @param value value to set the TEAM_ID
     */
    public void setTeamId(Integer value) {
        setAttributeInternal(TEAMID, value);
    }

    /**
     * Gets the attribute value for USER_ID using the alias name UserId.
     * @return the USER_ID
     */
    public Long getUserId() {
        return (Long) getAttributeInternal(USERID);
    }

    /**
     * Sets <code>value</code> as attribute value for USER_ID using the alias name UserId.
     * @param value value to set the USER_ID
     */
    public void setUserId(Long value) {
        setAttributeInternal(USERID, value);
    }

    /**
     * Gets the attribute value for VERSION_NO using the alias name VersionNo.
     * @return the VERSION_NO
     */
    public Long getVersionNo() {
        return (Long) getAttributeInternal(VERSIONNO);
    }

    /**
     * Sets <code>value</code> as attribute value for VERSION_NO using the alias name VersionNo.
     * @param value value to set the VERSION_NO
     */
    public void setVersionNo(Long value) {
        setAttributeInternal(VERSIONNO, value);
    }

    /**
     * Gets the attribute value for CREATED_BY using the alias name CreatedBy1.
     * @return the CREATED_BY
     */
    public String getCreatedBy1() {
        return (String) getAttributeInternal(CREATEDBY1);
    }

    /**
     * Gets the attribute value for CREATED_ON using the alias name CreatedOn1.
     * @return the CREATED_ON
     */
    public Timestamp getCreatedOn1() {
        return (Timestamp) getAttributeInternal(CREATEDON1);
    }

    /**
     * Gets the attribute value for DESCRIPTION using the alias name Description.
     * @return the DESCRIPTION
     */
    public String getDescription() {
        return (String) getAttributeInternal(DESCRIPTION);
    }

    /**
     * Sets <code>value</code> as attribute value for DESCRIPTION using the alias name Description.
     * @param value value to set the DESCRIPTION
     */
    public void setDescription(String value) {
        setAttributeInternal(DESCRIPTION, value);
    }

    /**
     * Gets the attribute value for END_DATE using the alias name EndDate1.
     * @return the END_DATE
     */
    public Timestamp getEndDate1() {
        return (Timestamp) getAttributeInternal(ENDDATE1);
    }

    /**
     * Sets <code>value</code> as attribute value for END_DATE using the alias name EndDate1.
     * @param value value to set the END_DATE
     */
    public void setEndDate1(Timestamp value) {
        setAttributeInternal(ENDDATE1, value);
    }

    /**
     * Gets the attribute value for IS_ACTIVE using the alias name IsActive1.
     * @return the IS_ACTIVE
     */
    public String getIsActive1() {
        return (String) getAttributeInternal(ISACTIVE1);
    }

    /**
     * Sets <code>value</code> as attribute value for IS_ACTIVE using the alias name IsActive1.
     * @param value value to set the IS_ACTIVE
     */
    public void setIsActive1(String value) {
        setAttributeInternal(ISACTIVE1, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy1.
     * @return the LAST_UPDATED_BY
     */
    public String getLastUpdatedBy1() {
        return (String) getAttributeInternal(LASTUPDATEDBY1);
    }

    /**
     * Gets the attribute value for LAST_UPDATED_ON using the alias name LastUpdatedOn1.
     * @return the LAST_UPDATED_ON
     */
    public Timestamp getLastUpdatedOn1() {
        return (Timestamp) getAttributeInternal(LASTUPDATEDON1);
    }

    /**
     * Gets the attribute value for ROLE_ID using the alias name RoleId.
     * @return the ROLE_ID
     */
    public DBSequence getRoleId() {
        return (DBSequence) getAttributeInternal(ROLEID);
    }

    /**
     * Sets <code>value</code> as attribute value for ROLE_ID using the alias name RoleId.
     * @param value value to set the ROLE_ID
     */
    public void setRoleId(DBSequence value) {
        setAttributeInternal(ROLEID, value);
    }

    /**
     * Gets the attribute value for ROLE_NAME_ID using the alias name RoleNameId.
     * @return the ROLE_NAME_ID
     */
    public String getRoleNameId() {
        return (String) getAttributeInternal(ROLENAMEID);
    }

    /**
     * Sets <code>value</code> as attribute value for ROLE_NAME_ID using the alias name RoleNameId.
     * @param value value to set the ROLE_NAME_ID
     */
    public void setRoleNameId(String value) {
        setAttributeInternal(ROLENAMEID, value);
    }

    /**
     * Gets the attribute value for START_DATE using the alias name StartDate1.
     * @return the START_DATE
     */
    public Timestamp getStartDate1() {
        return (Timestamp) getAttributeInternal(STARTDATE1);
    }

    /**
     * Sets <code>value</code> as attribute value for START_DATE using the alias name StartDate1.
     * @param value value to set the START_DATE
     */
    public void setStartDate1(Timestamp value) {
        setAttributeInternal(STARTDATE1, value);
    }

    /**
     * Gets the attribute value for VERSION_NO using the alias name VersionNo1.
     * @return the VERSION_NO
     */
    public Long getVersionNo1() {
        return (Long) getAttributeInternal(VERSIONNO1);
    }

    /**
     * Sets <code>value</code> as attribute value for VERSION_NO using the alias name VersionNo1.
     * @param value value to set the VERSION_NO
     */
    public void setVersionNo1(Long value) {
        setAttributeInternal(VERSIONNO1, value);
    }

    /**
     * Gets the attribute value for the calculated attribute AreAssociated.
     * @return the AreAssociated
     */
    public Boolean getAreAssociated() {
        return (Boolean) getAttributeInternal(AREASSOCIATED);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute AreAssociated.
     * @param value value to set the  AreAssociated
     */
    public void setAreAssociated(Boolean value) {
        Boolean oldValue = getAreAssociated();
        setAttributeInternal(AREASSOCIATED, value);
        if ( oldValue != value )
            {
              if ( value )
              {
                createIntersectionRow( Integer.parseInt(getUserId().toString()), Integer.parseInt(getRoleId().toString()) );
              }
              else
              {
                deleteIntersectionRow();
              }
            }
    }
    
    public void createIntersectionRow( Integer userId, Integer roleId )
      { System.out.println("Insert userid="+userId+" roleId="+roleId);
        RowSet rowset = getUsersRolesUVO1();
        Row row = rowset.createRow();
        row.setAttribute("UserId", userId );
        row.setAttribute("RoleId", roleId );
        rowset.insertRow( row );
        getDBTransaction().commit();
      }
    
    public void deleteIntersectionRow()
      { System.out.println("Delete");
        RowSet rowset = getUsersRolesUVO1();
        if ( rowset.getRowCount() == 1 )
        {
          Row atRangeIndex = rowset.getRowAtRangeIndex(0);
          atRangeIndex.remove();
        }
        getDBTransaction().commit();
      }

    /**
     * Gets the view accessor <code>RowSet</code> UsersRolesUVO1.
     */
    public RowSet getUsersRolesUVO1() {
        return (RowSet) getAttributeInternal(USERSROLESUVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> RoleNameLookupVO1.
     */
    public RowSet getRoleNameLookupVO1() {
        return (RowSet) getAttributeInternal(ROLENAMELOOKUPVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> RoleNameLookup1.
     */
    public RowSet getRoleNameLookup1() {
        return (RowSet) getAttributeInternal(ROLENAMELOOKUP1);
    }
}

