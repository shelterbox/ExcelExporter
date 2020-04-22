// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package xlsreport.proxies;

public class MxConstraint
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject mxConstraintMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "XLSReport.MxConstraint";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Sequence("Sequence"),
		Summary("Summary"),
		Attribute("Attribute"),
		Constraint("Constraint"),
		AttributeType("AttributeType"),
		ConstraintText("ConstraintText"),
		ConstraintNumber("ConstraintNumber"),
		ConstraintFloat("ConstraintFloat"),
		ConstraintDateTime("ConstraintDateTime"),
		ConstraintBoolean("ConstraintBoolean"),
		AndOr("AndOr"),
		MxConstraint_MxSheet("XLSReport.MxConstraint_MxSheet"),
		MxConstraint_MxXPath("XLSReport.MxConstraint_MxXPath");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public MxConstraint(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "XLSReport.MxConstraint"));
	}

	protected MxConstraint(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mxConstraintMendixObject)
	{
		if (mxConstraintMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("XLSReport.MxConstraint", mxConstraintMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a XLSReport.MxConstraint");

		this.mxConstraintMendixObject = mxConstraintMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'MxConstraint.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static xlsreport.proxies.MxConstraint initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return xlsreport.proxies.MxConstraint.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static xlsreport.proxies.MxConstraint initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new xlsreport.proxies.MxConstraint(context, mendixObject);
	}

	public static xlsreport.proxies.MxConstraint load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return xlsreport.proxies.MxConstraint.initialize(context, mendixObject);
	}

	public static java.util.List<xlsreport.proxies.MxConstraint> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<xlsreport.proxies.MxConstraint> result = new java.util.ArrayList<xlsreport.proxies.MxConstraint>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//XLSReport.MxConstraint" + xpathConstraint))
			result.add(xlsreport.proxies.MxConstraint.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Sequence
	 */
	public final java.lang.Integer getSequence()
	{
		return getSequence(getContext());
	}

	/**
	 * @param context
	 * @return value of Sequence
	 */
	public final java.lang.Integer getSequence(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Sequence.toString());
	}

	/**
	 * Set value of Sequence
	 * @param sequence
	 */
	public final void setSequence(java.lang.Integer sequence)
	{
		setSequence(getContext(), sequence);
	}

	/**
	 * Set value of Sequence
	 * @param context
	 * @param sequence
	 */
	public final void setSequence(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer sequence)
	{
		getMendixObject().setValue(context, MemberNames.Sequence.toString(), sequence);
	}

	/**
	 * @return value of Summary
	 */
	public final java.lang.String getSummary()
	{
		return getSummary(getContext());
	}

	/**
	 * @param context
	 * @return value of Summary
	 */
	public final java.lang.String getSummary(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Summary.toString());
	}

	/**
	 * Set value of Summary
	 * @param summary
	 */
	public final void setSummary(java.lang.String summary)
	{
		setSummary(getContext(), summary);
	}

	/**
	 * Set value of Summary
	 * @param context
	 * @param summary
	 */
	public final void setSummary(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String summary)
	{
		getMendixObject().setValue(context, MemberNames.Summary.toString(), summary);
	}

	/**
	 * @return value of Attribute
	 */
	public final java.lang.String getAttribute()
	{
		return getAttribute(getContext());
	}

	/**
	 * @param context
	 * @return value of Attribute
	 */
	public final java.lang.String getAttribute(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Attribute.toString());
	}

	/**
	 * Set value of Attribute
	 * @param attribute
	 */
	public final void setAttribute(java.lang.String attribute)
	{
		setAttribute(getContext(), attribute);
	}

	/**
	 * Set value of Attribute
	 * @param context
	 * @param attribute
	 */
	public final void setAttribute(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String attribute)
	{
		getMendixObject().setValue(context, MemberNames.Attribute.toString(), attribute);
	}

	/**
	 * Set value of Constraint
	 * @param constraint
	 */
	public final xlsreport.proxies.ConstraintType getConstraint()
	{
		return getConstraint(getContext());
	}

	/**
	 * @param context
	 * @return value of Constraint
	 */
	public final xlsreport.proxies.ConstraintType getConstraint(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Constraint.toString());
		if (obj == null)
			return null;

		return xlsreport.proxies.ConstraintType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Constraint
	 * @param constraint
	 */
	public final void setConstraint(xlsreport.proxies.ConstraintType constraint)
	{
		setConstraint(getContext(), constraint);
	}

	/**
	 * Set value of Constraint
	 * @param context
	 * @param constraint
	 */
	public final void setConstraint(com.mendix.systemwideinterfaces.core.IContext context, xlsreport.proxies.ConstraintType constraint)
	{
		if (constraint != null)
			getMendixObject().setValue(context, MemberNames.Constraint.toString(), constraint.toString());
		else
			getMendixObject().setValue(context, MemberNames.Constraint.toString(), null);
	}

	/**
	 * Set value of AttributeType
	 * @param attributetype
	 */
	public final xlsreport.proxies.AttributeType getAttributeType()
	{
		return getAttributeType(getContext());
	}

	/**
	 * @param context
	 * @return value of AttributeType
	 */
	public final xlsreport.proxies.AttributeType getAttributeType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.AttributeType.toString());
		if (obj == null)
			return null;

		return xlsreport.proxies.AttributeType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of AttributeType
	 * @param attributetype
	 */
	public final void setAttributeType(xlsreport.proxies.AttributeType attributetype)
	{
		setAttributeType(getContext(), attributetype);
	}

	/**
	 * Set value of AttributeType
	 * @param context
	 * @param attributetype
	 */
	public final void setAttributeType(com.mendix.systemwideinterfaces.core.IContext context, xlsreport.proxies.AttributeType attributetype)
	{
		if (attributetype != null)
			getMendixObject().setValue(context, MemberNames.AttributeType.toString(), attributetype.toString());
		else
			getMendixObject().setValue(context, MemberNames.AttributeType.toString(), null);
	}

	/**
	 * @return value of ConstraintText
	 */
	public final java.lang.String getConstraintText()
	{
		return getConstraintText(getContext());
	}

	/**
	 * @param context
	 * @return value of ConstraintText
	 */
	public final java.lang.String getConstraintText(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ConstraintText.toString());
	}

	/**
	 * Set value of ConstraintText
	 * @param constrainttext
	 */
	public final void setConstraintText(java.lang.String constrainttext)
	{
		setConstraintText(getContext(), constrainttext);
	}

	/**
	 * Set value of ConstraintText
	 * @param context
	 * @param constrainttext
	 */
	public final void setConstraintText(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String constrainttext)
	{
		getMendixObject().setValue(context, MemberNames.ConstraintText.toString(), constrainttext);
	}

	/**
	 * @return value of ConstraintNumber
	 */
	public final java.lang.Long getConstraintNumber()
	{
		return getConstraintNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of ConstraintNumber
	 */
	public final java.lang.Long getConstraintNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.ConstraintNumber.toString());
	}

	/**
	 * Set value of ConstraintNumber
	 * @param constraintnumber
	 */
	public final void setConstraintNumber(java.lang.Long constraintnumber)
	{
		setConstraintNumber(getContext(), constraintnumber);
	}

	/**
	 * Set value of ConstraintNumber
	 * @param context
	 * @param constraintnumber
	 */
	public final void setConstraintNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long constraintnumber)
	{
		getMendixObject().setValue(context, MemberNames.ConstraintNumber.toString(), constraintnumber);
	}

	/**
	 * @return value of ConstraintFloat
	 */
	public final java.lang.Double getConstraintFloat()
	{
		return getConstraintFloat(getContext());
	}

	/**
	 * @param context
	 * @return value of ConstraintFloat
	 */
	public final java.lang.Double getConstraintFloat(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Double) getMendixObject().getValue(context, MemberNames.ConstraintFloat.toString());
	}

	/**
	 * Set value of ConstraintFloat
	 * @param constraintfloat
	 */
	public final void setConstraintFloat(java.lang.Double constraintfloat)
	{
		setConstraintFloat(getContext(), constraintfloat);
	}

	/**
	 * Set value of ConstraintFloat
	 * @param context
	 * @param constraintfloat
	 */
	public final void setConstraintFloat(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Double constraintfloat)
	{
		getMendixObject().setValue(context, MemberNames.ConstraintFloat.toString(), constraintfloat);
	}

	/**
	 * Set value of ConstraintDateTime
	 * @param constraintdatetime
	 */
	public final xlsreport.proxies.DateTimeConstraint getConstraintDateTime()
	{
		return getConstraintDateTime(getContext());
	}

	/**
	 * @param context
	 * @return value of ConstraintDateTime
	 */
	public final xlsreport.proxies.DateTimeConstraint getConstraintDateTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.ConstraintDateTime.toString());
		if (obj == null)
			return null;

		return xlsreport.proxies.DateTimeConstraint.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of ConstraintDateTime
	 * @param constraintdatetime
	 */
	public final void setConstraintDateTime(xlsreport.proxies.DateTimeConstraint constraintdatetime)
	{
		setConstraintDateTime(getContext(), constraintdatetime);
	}

	/**
	 * Set value of ConstraintDateTime
	 * @param context
	 * @param constraintdatetime
	 */
	public final void setConstraintDateTime(com.mendix.systemwideinterfaces.core.IContext context, xlsreport.proxies.DateTimeConstraint constraintdatetime)
	{
		if (constraintdatetime != null)
			getMendixObject().setValue(context, MemberNames.ConstraintDateTime.toString(), constraintdatetime.toString());
		else
			getMendixObject().setValue(context, MemberNames.ConstraintDateTime.toString(), null);
	}

	/**
	 * @return value of ConstraintBoolean
	 */
	public final java.lang.Boolean getConstraintBoolean()
	{
		return getConstraintBoolean(getContext());
	}

	/**
	 * @param context
	 * @return value of ConstraintBoolean
	 */
	public final java.lang.Boolean getConstraintBoolean(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ConstraintBoolean.toString());
	}

	/**
	 * Set value of ConstraintBoolean
	 * @param constraintboolean
	 */
	public final void setConstraintBoolean(java.lang.Boolean constraintboolean)
	{
		setConstraintBoolean(getContext(), constraintboolean);
	}

	/**
	 * Set value of ConstraintBoolean
	 * @param context
	 * @param constraintboolean
	 */
	public final void setConstraintBoolean(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean constraintboolean)
	{
		getMendixObject().setValue(context, MemberNames.ConstraintBoolean.toString(), constraintboolean);
	}

	/**
	 * Set value of AndOr
	 * @param andor
	 */
	public final xlsreport.proxies.AndOr getAndOr()
	{
		return getAndOr(getContext());
	}

	/**
	 * @param context
	 * @return value of AndOr
	 */
	public final xlsreport.proxies.AndOr getAndOr(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.AndOr.toString());
		if (obj == null)
			return null;

		return xlsreport.proxies.AndOr.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of AndOr
	 * @param andor
	 */
	public final void setAndOr(xlsreport.proxies.AndOr andor)
	{
		setAndOr(getContext(), andor);
	}

	/**
	 * Set value of AndOr
	 * @param context
	 * @param andor
	 */
	public final void setAndOr(com.mendix.systemwideinterfaces.core.IContext context, xlsreport.proxies.AndOr andor)
	{
		if (andor != null)
			getMendixObject().setValue(context, MemberNames.AndOr.toString(), andor.toString());
		else
			getMendixObject().setValue(context, MemberNames.AndOr.toString(), null);
	}

	/**
	 * @return value of MxConstraint_MxSheet
	 */
	public final xlsreport.proxies.MxSheet getMxConstraint_MxSheet() throws com.mendix.core.CoreException
	{
		return getMxConstraint_MxSheet(getContext());
	}

	/**
	 * @param context
	 * @return value of MxConstraint_MxSheet
	 */
	public final xlsreport.proxies.MxSheet getMxConstraint_MxSheet(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		xlsreport.proxies.MxSheet result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.MxConstraint_MxSheet.toString());
		if (identifier != null)
			result = xlsreport.proxies.MxSheet.load(context, identifier);
		return result;
	}

	/**
	 * Set value of MxConstraint_MxSheet
	 * @param mxconstraint_mxsheet
	 */
	public final void setMxConstraint_MxSheet(xlsreport.proxies.MxSheet mxconstraint_mxsheet)
	{
		setMxConstraint_MxSheet(getContext(), mxconstraint_mxsheet);
	}

	/**
	 * Set value of MxConstraint_MxSheet
	 * @param context
	 * @param mxconstraint_mxsheet
	 */
	public final void setMxConstraint_MxSheet(com.mendix.systemwideinterfaces.core.IContext context, xlsreport.proxies.MxSheet mxconstraint_mxsheet)
	{
		if (mxconstraint_mxsheet == null)
			getMendixObject().setValue(context, MemberNames.MxConstraint_MxSheet.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.MxConstraint_MxSheet.toString(), mxconstraint_mxsheet.getMendixObject().getId());
	}

	/**
	 * @return value of MxConstraint_MxXPath
	 */
	public final xlsreport.proxies.MxXPath getMxConstraint_MxXPath() throws com.mendix.core.CoreException
	{
		return getMxConstraint_MxXPath(getContext());
	}

	/**
	 * @param context
	 * @return value of MxConstraint_MxXPath
	 */
	public final xlsreport.proxies.MxXPath getMxConstraint_MxXPath(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		xlsreport.proxies.MxXPath result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.MxConstraint_MxXPath.toString());
		if (identifier != null)
			result = xlsreport.proxies.MxXPath.load(context, identifier);
		return result;
	}

	/**
	 * Set value of MxConstraint_MxXPath
	 * @param mxconstraint_mxxpath
	 */
	public final void setMxConstraint_MxXPath(xlsreport.proxies.MxXPath mxconstraint_mxxpath)
	{
		setMxConstraint_MxXPath(getContext(), mxconstraint_mxxpath);
	}

	/**
	 * Set value of MxConstraint_MxXPath
	 * @param context
	 * @param mxconstraint_mxxpath
	 */
	public final void setMxConstraint_MxXPath(com.mendix.systemwideinterfaces.core.IContext context, xlsreport.proxies.MxXPath mxconstraint_mxxpath)
	{
		if (mxconstraint_mxxpath == null)
			getMendixObject().setValue(context, MemberNames.MxConstraint_MxXPath.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.MxConstraint_MxXPath.toString(), mxconstraint_mxxpath.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return mxConstraintMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final xlsreport.proxies.MxConstraint that = (xlsreport.proxies.MxConstraint) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "XLSReport.MxConstraint";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
