package model.customer.UVO;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Aug 21 15:17:57 IST 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class OpportunitiesUVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public OpportunitiesUVOImpl() {
    }

    /**
     * Returns the variable value for custId.
     * @return variable value for custId
     */
    public Long getcustId() {
        return (Long) ensureVariableManager().getVariableValue("custId");
    }

    /**
     * Sets <code>value</code> for variable custId.
     * @param value value to bind as custId
     */
    public void setcustId(Long value) {
        ensureVariableManager().setVariableValue("custId", value);
    }
}
