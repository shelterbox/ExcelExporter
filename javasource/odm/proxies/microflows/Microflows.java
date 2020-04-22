// This file was generated by Mendix Modeler 6.10.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package odm.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;

public class Microflows
{
	// These are the microflows for the ODM module
	public static void iVK_AsyncNew(IContext context, odm.proxies.Order _order)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Order", _order == null ? null : _order.getMendixObject());
			Core.execute(context, "ODM.IVK_AsyncNew", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_DeleteAll(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "ODM.IVK_DeleteAll", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_GenerateData(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "ODM.IVK_GenerateData", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_GenerateReport(IContext context, xlsreport.proxies.MxTemplate _mxTemplate, odm.proxies.Order _order)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("MxTemplate", _mxTemplate == null ? null : _mxTemplate.getMendixObject());
			params.put("Order", _order == null ? null : _order.getMendixObject());
			Core.execute(context, "ODM.IVK_GenerateReport", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_SaveOrderLine(IContext context, odm.proxies.OrderLine _orderLine)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("OrderLine", _orderLine == null ? null : _orderLine.getMendixObject());
			Core.execute(context, "ODM.IVK_SaveOrderLine", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void oCh_OrderLine(IContext context, odm.proxies.OrderLine _orderLine)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("OrderLine", _orderLine == null ? null : _orderLine.getMendixObject());
			Core.execute(context, "ODM.OCh_OrderLine", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.lang.String vA_ProductName(IContext context, odm.proxies.Product _product)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Product", _product == null ? null : _product.getMendixObject());
			return (java.lang.String)Core.execute(context, "ODM.VA_ProductName", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}