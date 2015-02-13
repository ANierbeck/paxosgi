package com.metlife.gs.cons;
import org.apache.felix.scr.annotations.*;

/**
 * 
 * @author iGate
 * 
 */
//lets see if this path works!
@Component
public final class GSConstants  {

	public GSConstants() {
		super();
	}

	public static final String GSPROPERTIES = "gsProperties";
	public static final String TENANT_BASE_FOLDR = "tenant_base_folder";
	public static final String PATH_SEPARATOR = "/";
	public static final String GEBROPERTIES = "GEBProperties";
	public static final String SERVICENAME = "serviceName";
	public static final String SERVICEPORT = "servicePort";
	public static final String ENDPOINTURL = "endPointUrl";
	public static final String POLICY_INFO_VIEW = "";
	/**
	 * Login Html View
	 */
	public static final String LOGINVIEW = "loginView";
	/**
	 * Home Html View
	 */
	public static final String HOMEVIEW = "homeView";
	public static final String CREATEUSERVIEW = "createUserView";
	public static final String SEARCHUSERVIEW = "searchUserView";
	public static final String EDITUSERVIEW = "editUserView";
	public static final String EDITUSERVIEW1 = "editUserView1";
	public static final String UPLOADIDVIEW = "uploadIdView";
	public static final String EDITIDVIEW = "editIdView";
	public static final String SEARCHIDVIEW = "searchIdView";
	/**
	 * Pension Html View
	 */
	public static final String PENSIONVIEW = "pensionView";
	public static final String PENCNTRT_ACCINFOVW = "pensioinContractAccInfoView";
	/**
	 * Contract Html View
	 */
	public static final String CONTRACT_INFO_VW = "contractDetailView";
	/**
	 * Policy Html View
	 */
	public static final String LIFEPA_VIEW = "lifePAView";
	public static final String POLICY_DET_VIEW = "policyDetailView";
	/**
	 * User_Profile View
	 */
	public static final String USER_PROFINFO_VW = "userInfoView";
	/**
	 * User_Profile Information mapping
	 */
	public static final String USERPROF_INFO_REQ = "userInfoRequest";
	public static final String USERPROF_INFORESP = "userInfoResponse";
	/**
	 * Pension XLS Mapping
	 */
	public static final String PENSION_REQUEST = "pensionRequest";
	public static final String PENSION_RESPONSE = "pensionResponse";
	/**
	 * Policy XLS Mapping
	 */
	public static final String POLICY_DET_REQ = "policyDetailRequest";
	public static final String POLICY_DET_RESP = "policyDetailResponse";
	public static final String POLICY_OVER_VW = "policyOverView";
	/**
	 * Contract xsl mapping
	 */
	public static final String CONTRACTINFO_REQ = "contractInfoRequest";
	public static final String CONTRACTINFO_RESP = "contractInfoResponse";
	/**
	 * PDF Generation xsl mapping
	 */
	public static final String FORMSELVIEW = "formSelectionView";
	public static final String DOT = ".";
	public static final String HASH_SIGN = "#";
	public static final String LEAVE_REQUEST = "leaveFormRequest";
	public static final String LEAVE_RESPONSE = "leaveFormResponse";
	public static final String RETIREMENT_REQ = "retirementFormRequest";
	public static final String RETIREMENT_RESP = "retirementFormResponse";
	public static final String TRANSFER_REQUEST = "transferFormRequest";
	public static final String TRANSFER_RESPONSE = "transferFormResponse";
	public static final String ACCOUNT_REQUEST = "accountFormRequest";
	public static final String ACCOUNT_RESPONSE = "accountFormResponse";
	/**
	 * Form selection
	 */
	public static final String FORM_SELECTED = "selectForm";
	public static final String FORM_LEAVE = "leaveForm";
	public static final String FORM_RETIREMENT = "retirementForm";
	public static final String FORM_TRANSFER = "transferForm";
	public static final String FORM_ACCOUNT = "accountForm";
	public static final String FORM_COMBO_SELECT = "formComboSelect";
	public static final String POLICY_ID = "2";
	public static final String JSON_CUR_ROOT_TAG = "result";

	public static final String PEN_CONTR_ACCINFO_REQ = "pensionContractAccInfoRequest";
	public static final String PEN_CONTR_ACCINFO_RESP = "pensionContractAccInfoResponse";
	/**
	 * Web services
	 */
	public static final String PENSION_CONTRACT_ACC_SERVICE = "pensionContractAccService";
	/**
	 * contact
	 */
	public static final String CONTACT_INFO_VIEW = "contactInfoView";
	public static final String CONTACTINFO_REQ = "contactInfoRequest";
	public static final String CONTACTINFO_RESP = "contactInfoResponse";
	public static final String PID = "Pid";
	public static final String ADDRESSID = "Adresid";
	public static final String TELID = "Telid";
	public static final String CEPTELID = "Ceptelid";
	public static final String FAXID = "Faxid";
	public static final String EMAILID = "Emailid";

	public static final String PAGE_DATA = "pageData";
	/**
	 * View used at Delegate layer
	 */
	public static final String RESPONSE_VIEW = "responseView";
	public static final String CUSTOMER_ID = "customerId";
	/**
	 * Payment Plan request and response
	 */
	public static final String PAYMENT_PLAN_REQ = "paymentPlanRequest";
	public static final String PAYMENT_PLAN_RESP = "paymentPlanResponse";
	/**
	 * Payment Plan View
	 */
	public static final String PAYMENT_PLAN_VIEW = "paymentPlanView";
	/**
	 * Account abstract
	 */
	public static final String ABSTRACT_ACC_VW = "accountAbstractView";
	public static final String ABSTRACT_ACC_REQ = "accountAbstractRequest";
	public static final String ABSTRACT_ACC_RESP = "accountAbstractResponse";
	/**
	 * Exception
	 */
	public static final String EXCEPTION_MESSAGE = "exception";
	public static final String ERROR_MESSAGE = "error_message";
	public static final String ERROR_CODE = "error_code";
	/**
	 * Payement term policy admin
	 */
	public static final String PAYTERM_POL_ADMVW = "payementTermPolicy";
	public static final String PAY_TERM_POLICY_ADMIN_REQUEST = "payementTermPolicyRequest";
	public static final String PAY_TERM_POLICY_ADMIN_RESPONSE = "payementTermPolicyResponse";
	public static final String SERVICEREQ_XSL = "serviceReqXSL";
	public static final String SERVICERESP_XSL = "serviceRespXSL";
	public static final String TENANT_CODE = "tenantCode";
	public static final String REMEMPTY_TAGXSL = "removeEmptyTagXSL";
	public static final String JSON = "json";
	public static final String ISSTRINGNULLOREMPTY = "isStringNullOrEmpty";
	public static final String HASTEXT = "hasText";
	public static final String ISNOTNULL = "isNotNull";
	public static final String CONVERTNULLSTRING = "convertNullString";
	public static final String ISARRAYNULLOREMPTY = "isArrayNullOrEmpty";
	public static final String ISARRAYNOTEMPTY = "isArrayNotEmpty";
	public static final String ISCOLLNULLOREMPTY = "isCollectionNullOrEmpty";
	public static final String ISCOLLNOTEMPTY = "isCollectionNotEmpty";
	public static final String ISNOTEQUAL = "isNotEqual";
	public static final String PRINTMEMORYSTACK = "printMemoryStack";
	public static final String GETCURRENTFDATETIME = "getcurrentDateTime";
	public static final String STRINGTRIM = "StringTrim";
	public static final String CONVERTUTF = "convertUTF8";
	public static final String ISMAPNOTNULLNOTEMPTY = "isMapNotNullAndNotEmpty";
	public static final String CURRENTTIMEAFTQUERYCALL = "currentTimeAfterQueryCall";
	public static final String CURRENTTIMEBEFQUERYCALL = "currentTimeBeforeQueryCall";
	/**
	 * Map Converter
	 */
//	public static final String OPEN_NODE = "<";
//	public static final String CLOSE_NODE = ">";
//	public static final String CLOSE_TAG = "</";
//	public static final String ATTR_DATASTR = "dataStr";
//	public static final String LIST = "list";
//	public static final String TAG_NAME = "tagName";
//	public static final String TOXML = "toXML";
//	public static final String TONESTEDXML = "toNestedXML";
//	public static final String RULESETS = "rulesets";
//	public static final String RULESET = "ruleset";
//	public static final String SHEETNAME = "sheetname";
//	public static final String RULE = "rule";
//	public static final String RULENAME = "rulename";
//	public static final String FIELD = "field";
//	public static final String FIELDNAME = "fieldname";
//	public static final String FIELDVALUE = "fieldvalue";
//	public static final String EMPTY_STRING = "";
//	public static final String GENERATEMAPEXTENDED = "generateMapExtended";
//	public static final String GETCHILDMAP = "getChildMap";
//	public static final String GETKEY = "getKey";
//	public static final String TONESTEDXMLADVANCED = "toNestedXMLAdvanced";
//	public static final String CREATECHILDNODEFROMMAP = "createChildNodeFromMap";
//	public static final String CREATECHILDNODEFROMSTRING = "createChildNodeFromString";
	/**
	 * SimpleServiceHeaderHelper
	 */
//	public static final String USERTYPE = "UserType";
//	public static final String USERID = "UserID";
//	public static final String LESSTHAN = "<";
//	public static final String GREATERTHAN = ">";
//	public static final String SLASH = "/";
//	public static final String LESSTHAN_SLASH = "</";
//	public static final String APPL_NAME = "ApplicationName";
//	public static final String HOST_NAME = "HostName";
//	public static final String SRV_NAME = "ServerName";
//	public static final String PROXYUSER_ID = "ProxyUserID";
//	public static final String REQUEST_ID = "RequestID";
//	public static final String SESSION_ID = "SessionID";
//	public static final String LOADMDC = "loadMDC";
//	public static final String OUTPUTMDCFORALLKEYS = "outputMDCForAllKeys";
//	public static final String HOSTNAME = "HOSTNAME";
//	public static final String TOJSONSTRING = "toJSNString";
//	public static final String FROMSTRING = "fromString";
//	public static final String FROMXML = "fromXML";
	/**
	 * FileUtils
	 */
	public static final String COPY = "copy";
	public static final String GETFILESLIST = "getFilesList";
	public static final String READFILEINSTRING = "readFileInString";
	public static final String READFILE = "readFile";
	
	/**
	 * JsonConverter
	 */
	public static final String GENERATEXML = "generateXML";
	public static final String GENERATEJSON = "generateJson";
	public static final String REMOVENAMESPACE = "removeNameSpace";
	public static final String REMOVEXMLSTRINGNAMESPACEPR = "removeXmlStringNamespaceAndPreamble";
	public static final String EXTRACTBODY = "extractBody";
	public static final char GREATERTHAN_CHAR = '>';
	public static final char SPACE_CHAR = ' ';
	public static final char NEWLINE_CHAR = '\n';
	/**
	 * EncryptDecryptData
	 */
	public static final String ENCRYPTDECRYPTDATA = "EncryptDecryptData";
	public static final String ENCRYPTDATA = "encryptData";
	public static final String DECRYPTDATA = "decryptData";
	
	/**
	 * DBPropertyManagerImpl
	 */
	public static final String GETPROP = "getProp";
	public static final String EMPTYSTRING = "";
	public static final String GETPROPERTYNAMES = "getPropertyNames";
	public static final String SETPROP = "setProp";
	/**
	 * TransactionIDGenerator
	 */
	public static final String HYPHEN = "-";
	public static final String STR_ZERO = "0";
	public static final String STR_BLANK = "";
	public static final String GETTRANSID = "getTransID";
	public static final String PREFIXZERO = "prefixZero";
	public static final String GETRANDOMTRANSID = "getRandomTransID";
	public static final String GETLONGSEED = "getLongSeed";
}
