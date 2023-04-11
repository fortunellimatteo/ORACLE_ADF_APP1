package demo.model;

import java.sql.Timestamp;

import oracle.jbo.Key;
import oracle.jbo.domain.Date;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Apr 04 11:16:58 CEST 2023
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DepartmentImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        IdDepartment,
        NameDepartment,
        Fromdate,
        Todate,
        SysEffectiveDate;
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


    public static final int IDDEPARTMENT = AttributesEnum.IdDepartment.index();
    public static final int NAMEDEPARTMENT = AttributesEnum.NameDepartment.index();
    public static final int FROMDATE = AttributesEnum.Fromdate.index();
    public static final int TODATE = AttributesEnum.Todate.index();
    public static final int SYSEFFECTIVEDATE = AttributesEnum.SysEffectiveDate.index();

    /**
     * This is the default constructor (do not remove).
     */
    public DepartmentImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("demo.model.Department");
    }


    /**
     * Gets the attribute value for IdDepartment, using the alias name IdDepartment.
     * @return the value of IdDepartment
     */
    public Long getIdDepartment() {
        return (Long) getAttributeInternal(IDDEPARTMENT);
    }

    /**
     * Sets <code>value</code> as the attribute value for IdDepartment.
     * @param value value to set the IdDepartment
     */
    public void setIdDepartment(Long value) {
        setAttributeInternal(IDDEPARTMENT, value);
    }

    /**
     * Gets the attribute value for NameDepartment, using the alias name NameDepartment.
     * @return the value of NameDepartment
     */
    public String getNameDepartment() {
        return (String) getAttributeInternal(NAMEDEPARTMENT);
    }

    /**
     * Sets <code>value</code> as the attribute value for NameDepartment.
     * @param value value to set the NameDepartment
     */
    public void setNameDepartment(String value) {
        setAttributeInternal(NAMEDEPARTMENT, value);
    }

    /**
     * Gets the attribute value for Fromdate, using the alias name Fromdate.
     * @return the value of Fromdate
     */
    public Date getFromdate() {
        return (Date) getAttributeInternal(FROMDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Fromdate.
     * @param value value to set the Fromdate
     */
    public void setFromdate(Date value) {
        setAttributeInternal(FROMDATE, value);
    }

    /**
     * Gets the attribute value for Todate, using the alias name Todate.
     * @return the value of Todate
     */
    public Date getTodate() {
        return (Date) getAttributeInternal(TODATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Todate.
     * @param value value to set the Todate
     */
    public void setTodate(Date value) {
        setAttributeInternal(TODATE, value);
    }

    /**
     * Gets the attribute value for SysEffectiveDate, using the alias name SysEffectiveDate.
     * @return the value of SysEffectiveDate
     */
    public Date getSysEffectiveDate() {
        return (Date) getAttributeInternal(SYSEFFECTIVEDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for SysEffectiveDate.
     * @param value value to set the SysEffectiveDate
     */
    public void setSysEffectiveDate(Date value) {
        setAttributeInternal(SYSEFFECTIVEDATE, value);
    }

    /**
     * @param idDepartment key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Long idDepartment) {
        return new Key(new Object[] { idDepartment });
    }


}

