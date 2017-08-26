package model.UVO;

import java.sql.Timestamp;

import model.EO.RoleEOImpl;

import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.domain.DBSequence;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Aug 26 15:40:51 IST 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class RolesUVORowImpl extends ViewRowImpl {
    public static final int ENTITY_ROLEEO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        RoleId,
        RoleNameId,
        StartDate,
        EndDate,
        Description,
        CreatedBy,
        CreatedOn,
        LastUpdatedBy,
        LastUpdatedOn,
        VersionNo,
        IsActive,
        UsersRolesU,
        UsersRolesU1,
        LookupsU,
        RoleNameLookup1;
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
    public static final int ROLEID = AttributesEnum.RoleId.index();
    public static final int ROLENAMEID = AttributesEnum.RoleNameId.index();
    public static final int STARTDATE = AttributesEnum.StartDate.index();
    public static final int ENDDATE = AttributesEnum.EndDate.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDON = AttributesEnum.CreatedOn.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDON = AttributesEnum.LastUpdatedOn.index();
    public static final int VERSIONNO = AttributesEnum.VersionNo.index();
    public static final int ISACTIVE = AttributesEnum.IsActive.index();
    public static final int USERSROLESU = AttributesEnum.UsersRolesU.index();
    public static final int USERSROLESU1 = AttributesEnum.UsersRolesU1.index();
    public static final int LOOKUPSU = AttributesEnum.LookupsU.index();
    public static final int ROLENAMELOOKUP1 = AttributesEnum.RoleNameLookup1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public RolesUVORowImpl() {
    }

    /**
     * Gets RoleEO entity object.
     * @return the RoleEO
     */
    public RoleEOImpl getRoleEO() {
        return (RoleEOImpl) getEntity(ENTITY_ROLEEO);
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
     * Gets the associated <code>RowIterator</code> using master-detail link UsersRolesU.
     */
    public RowIterator getUsersRolesU() {
        return (RowIterator) getAttributeInternal(USERSROLESU);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link UsersRolesU1.
     */
    public RowIterator getUsersRolesU1() {
        return (RowIterator) getAttributeInternal(USERSROLESU1);
    }

    /**
     * Gets the associated <code>ViewRowImpl</code> using master-detail link LookupsU.
     */
    public ViewRowImpl getLookupsU() {
        return (ViewRowImpl) getAttributeInternal(LOOKUPSU);
    }

    /**
     * Sets the master-detail link LookupsU between this object and <code>value</code>.
     */
    public void setLookupsU(ViewRowImpl value) {
        setAttributeInternal(LOOKUPSU, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> RoleNameLookup1.
     */
    public RowSet getRoleNameLookup1() {
        return (RowSet) getAttributeInternal(ROLENAMELOOKUP1);
    }
}
