package com.metlife.gs.to;
import org.apache.felix.scr.annotations.*;
import java.io.Serializable;

import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.metlife.gs.api.GSvPMetLifeCommonBaseTOInterface;
import com.metlife.gs.cons.GSConstants;
@Component
@Service(value = com.metlife.gs.api.GSvPMetLifeCommonBaseTOInterface.class)
/*******************************************************************************
 * iGATE Corporation.
 * 
 * Project : GSP (Global Sales Platform) Program : BaseTO.java Author : iGATE
 * Date : DEC-2012 Revision Log (mm/dd/yy initials description)
 * -------------------------------------------------------- Created iGate
 * 12/30/2012
 ******************************************************************************/

public class BaseTO implements Serializable, GSvPMetLifeCommonBaseTOInterface {

	/**
	 * Logger Variable
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(BaseTO.class);

	private static final long serialVersionUID = 1L;

	private String serviceReqXSL;
	private String serviceRespXSL;
	private String tenantCode;
	private String removeEmptyTagXSL;
	private String errorListXSL;
	private JSONObject jsonObject;
	private String serviceName;

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public JSONObject getJsonObject() {
		return jsonObject;
	}

	public void setJsonObject(JSONObject jsonObject) {
		this.jsonObject = jsonObject;
	}

	/**
	 * @return the serviceReqXSL
	 */
	public String getServiceReqXSL() {
		return serviceReqXSL;
	}

	/**
	 * @param serviceReqXSL
	 *            the serviceReqXSL to set
	 */
	public void setServiceReqXSL(String serviceReqXSL) {
		this.serviceReqXSL = serviceReqXSL;
	}

	/**
	 * @return the serviceRespXSL
	 */
	public String getServiceRespXSL() {
		return serviceRespXSL;
	}

	/**
	 * @param serviceRespXSL
	 *            the serviceRespXSL to set
	 */
	public void setServiceRespXSL(String serviceRespXSL) {
		this.serviceRespXSL = serviceRespXSL;
	}

	/**
	 * @return
	 */
	public String getTenantCode() {
		return tenantCode;
	}

	/**
	 * @param tenantCode
	 */
	public void setTenantCode(String tenantCode) {
		this.tenantCode = tenantCode;
	}

	/**
	 * @return xsl as string
	 */
	public String getRemoveEmptyTagXSL() {
		return removeEmptyTagXSL;
	}

	/**
	 * @param removeEmptyTagXSL
	 */
	public void setRemoveEmptyTagXSL(String removeEmptyTagXSL) {
		this.removeEmptyTagXSL = removeEmptyTagXSL;
	}

	/**
	 * @param errorListXSL
	 */
	public void setErrorListXSL(String errorListXSL) {
		this.errorListXSL = errorListXSL;
	}

	/**
	 * @return
	 */
	public String getErrorListXSL() {
		return errorListXSL;
	}
	/**
	 * Description: This method is used to get JSON
	 * 
	 * @return JSONObject-jsonObject
	 */
	public JSONObject getJSON() {

		JSONObject json = new JSONObject();
		try {
			json.put(GSConstants.SERVICEREQ_XSL, this.getServiceReqXSL());
			json.put(GSConstants.SERVICERESP_XSL, this.getServiceRespXSL());
			json.put(GSConstants.TENANT_CODE, this.getTenantCode());
			json.put(GSConstants.REMEMPTY_TAGXSL, this.removeEmptyTagXSL);
			json.put(GSConstants.JSON, this.getJsonObject());
			json.put(GSConstants.SERVICENAME, this.getServiceName());
		} catch (JSONException e) {

			LOGGER.debug(e.toString());
		}
		return json;
	}

}
