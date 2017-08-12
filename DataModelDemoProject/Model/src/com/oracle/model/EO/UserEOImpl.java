package com.oracle.model.EO;

import java.sql.Timestamp;

import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.DBSequence;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
import oracle.jbo.server.TransactionEvent;

// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Aug 12 13:17:54 IST 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class UserEOImpl extends EntityImpl {
    @Override
    protected void prepareForDML(int i, TransactionEvent transactionEvent) {
        // TODO Implement this method
        SequenceImpl seq = new SequenceImpl("USERS_SEQ",getDBTransaction());
        setUserId(seq.getSequenceNumber().longValue());
        
        String s = getFirstName().substring(0,1).toUpperCase()+getLastName().toUpperCase()+'_'+seq.getSequenceNumber();
        setGlobalUsername(s);
        super.prepareForDML(i, transactionEvent);
    }

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        UserId,
        GlobalUsername,
        FirstName,
        MiddleName,
        LastName,
        Password,
        SupervisorId,
        StartDate,
        EndDate,
        TeamId,
        CreatedBy,
        CreatedOn,
        LastUpdatedBy,
        LastUpdatedOn,
        VersionNo,
        IsActive,
        User,
        SupervisorIdUser;
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


    public static final int USERID = AttributesEnum.UserId.index();
    public static final int GLOBALUSERNAME = AttributesEnum.GlobalUsername.index();
    public static final int FIRSTNAME = AttributesEnum.FirstName.index();
    public static final int MIDDLENAME = AttributesEnum.MiddleName.index();
    public static final int LASTNAME = AttributesEnum.LastName.index();
    public static final int PASSWORD = AttributesEnum.Password.index();
    public static final int SUPERVISORID = AttributesEnum.SupervisorId.index();
    public static final int STARTDATE = AttributesEnum.StartDate.index();
    public static final int ENDDATE = AttributesEnum.EndDate.index();
    public static final int TEAMID = AttributesEnum.TeamId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDON = AttributesEnum.CreatedOn.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDON = AttributesEnum.LastUpdatedOn.index();
    public static final int VERSIONNO = AttributesEnum.VersionNo.index();
    public static final int ISACTIVE = AttributesEnum.IsActive.index();
    public static final int USER = AttributesEnum.User.index();
    public static final int SUPERVISORIDUSER = AttributesEnum.SupervisorIdUser.index();

    /**
     * This is the default constructor (do not remove).
     */
    public UserEOImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("com.oracle.model.EO.UserEO");
    }


    /**
     * Gets the attribute value for UserId, using the alias name UserId.
     * @return the value of UserId
     */
    public Long getUserId() {
        return (Long) getAttributeInternal(USERID);
    }


    /**
     * Sets <code>value</code> as the attribute value for UserId.
     * @param value value to set the UserId
     */
    public void setUserId(Long value) {
        setAttributeInternal(USERID, value);
    }

    /**
     * Gets the attribute value for GlobalUsername, using the alias name GlobalUsername.
     * @return the value of GlobalUsername
     */
    public String getGlobalUsername() {
        return (String) getAttributeInternal(GLOBALUSERNAME);
    }


    /**
     * Sets <code>value</code> as the attribute value for GlobalUsername.
     * @param value value to set the GlobalUsername
     */
    public void setGlobalUsername(String value) {
        setAttributeInternal(GLOBALUSERNAME, value);
    }

    /**
     * Gets the attribute value for FirstName, using the alias name FirstName.
     * @return the value of FirstName
     */
    public String getFirstName() {
        return (String) getAttributeInternal(FIRSTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for FirstName.
     * @param value value to set the FirstName
     */
    public void setFirstName(String value) {
        setAttributeInternal(FIRSTNAME, value);
    }

    /**
     * Gets the attribute value for MiddleName, using the alias name MiddleName.
     * @return the value of MiddleName
     */
    public String getMiddleName() {
        return (String) getAttributeInternal(MIDDLENAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for MiddleName.
     * @param value value to set the MiddleName
     */
    public void setMiddleName(String value) {
        setAttributeInternal(MIDDLENAME, value);
    }

    /**
     * Gets the attribute value for LastName, using the alias name LastName.
     * @return the value of LastName
     */
    public String getLastName() {
        return (String) getAttributeInternal(LASTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastName.
     * @param value value to set the LastName
     */
    public void setLastName(String value) {
        setAttributeInternal(LASTNAME, value);
    }

    /**
     * Gets the attribute value for Password, using the alias name Password.
     * @return the value of Password
     */
    public String getPassword() {
        return (String) getAttributeInternal(PASSWORD);
    }

    /**
     * Sets <code>value</code> as the attribute value for Password.
     * @param value value to set the Password
     */
    public void setPassword(String value) {
        setAttributeInternal(PASSWORD, value);
    }

    /**
     * Gets the attribute value for SupervisorId, using the alias name SupervisorId.
     * @return the value of SupervisorId
     */
    public Long getSupervisorId() {
        return (Long) getAttributeInternal(SUPERVISORID);
    }

    /**
     * Sets <code>value</code> as the attribute value for SupervisorId.
     * @param value value to set the SupervisorId
     */
    public void setSupervisorId(Long value) {
        setAttributeInternal(SUPERVISORID, value);
    }

    /**
     * Gets the attribute value for StartDate, using the alias name StartDate.
     * @return the value of StartDate
     */
    public Timestamp getStartDate() {
        return (Timestamp) getAttributeInternal(STARTDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for StartDate.
     * @param value value to set the StartDate
     */
    public void setStartDate(Timestamp value) {
        setAttributeInternal(STARTDATE, value);
    }

    /**
     * Gets the attribute value for EndDate, using the alias name EndDate.
     * @return the value of EndDate
     */
    public Timestamp getEndDate() {
        return (Timestamp) getAttributeInternal(ENDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for EndDate.
     * @param value value to set the EndDate
     */
    public void setEndDate(Timestamp value) {
        setAttributeInternal(ENDDATE, value);
    }

    /**
     * Gets the attribute value for TeamId, using the alias name TeamId.
     * @return the value of TeamId
     */
    public Integer getTeamId() {
        return (Integer) getAttributeInternal(TEAMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for TeamId.
     * @param value value to set the TeamId
     */
    public void setTeamId(Integer value) {
        setAttributeInternal(TEAMID, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public String getCreatedBy() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CreatedOn, using the alias name CreatedOn.
     * @return the value of CreatedOn
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) getAttributeInternal(CREATEDON);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedOn.
     * @param value value to set the CreatedOn
     */
    public void setCreatedOn(Timestamp value) {
        setAttributeInternal(CREATEDON, value);
    }

    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the value of LastUpdatedBy
     */
    public String getLastUpdatedBy() {
        return (String) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedBy.
     * @param value value to set the LastUpdatedBy
     */
    public void setLastUpdatedBy(String value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LastUpdatedOn, using the alias name LastUpdatedOn.
     * @return the value of LastUpdatedOn
     */
    public Timestamp getLastUpdatedOn() {
        return (Timestamp) getAttributeInternal(LASTUPDATEDON);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedOn.
     * @param value value to set the LastUpdatedOn
     */
    public void setLastUpdatedOn(Timestamp value) {
        setAttributeInternal(LASTUPDATEDON, value);
    }

    /**
     * Gets the attribute value for VersionNo, using the alias name VersionNo.
     * @return the value of VersionNo
     */
    public Long getVersionNo() {
        return (Long) getAttributeInternal(VERSIONNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for VersionNo.
     * @param value value to set the VersionNo
     */
    public void setVersionNo(Long value) {
        setAttributeInternal(VERSIONNO, value);
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
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getUser() {
        return (RowIterator) getAttributeInternal(USER);
    }

    /**
     * @return the associated entity UserEOImpl.
     */
    public UserEOImpl getSupervisorIdUser() {
        return (UserEOImpl) getAttributeInternal(SUPERVISORIDUSER);
    }

    /**
     * Sets <code>value</code> as the associated entity UserEOImpl.
     */
    public void setSupervisorIdUser(UserEOImpl value) {
        setAttributeInternal(SUPERVISORIDUSER, value);
    }

    /**
     * @param userId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Long userId) {
        return new Key(new Object[] { userId });
    }


}

