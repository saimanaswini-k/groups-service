package org.sunbird.util;

import java.util.Arrays;
import java.util.List;

/** This interface will contains all the constants that's used throughout this application. */
public interface JsonKey {

  String CLASS = "class";
  String DATA = "data";
  String EKS = "eks";
  String ID = "id";
  String LEVEL = "level";
  String MESSAGE = "message";
  String METHOD = "method";
  String REQUEST_MESSAGE_ID = "msgId";
  String STACKTRACE = "stacktrace";
  String VER = "ver";
  String OK = "ok";
  String LOG_LEVEL = "logLevel";
  String ERROR = "error";
  String EMPTY_STRING = "";
  String RESPONSE = "response";
  String ADDRESS = "address";
  String KEY = "key";
  String ERROR_MSG = "error_msg";
  String ATTRIBUTE = "attribute";
  String ERRORS = "errors";
  String SUCCESS = "success";
  String API_VERSION = "v1";
  String REQ_ID = "reqId";
  String USER_DB = "user_db";
  String SUNBIRD_CASSANDRA_IP = "sunbird_cassandra_host";
  String SUNBIRD = "sunbird";
  String GROUP_ID = "groupId";
  String GROUP_DESC = "description";
  String GROUP_NAME = "name";
  String MEMBERS = "members";
  String MEMBER = "member";
  String USER_ID = "userId";
  String ROLE = "role";
  String ADMIN = "admin";
  String ACTIVE = "active";
  String INACTIVE = "inactive";
  String URL = "url";
  String LOG_TYPE = "logType";
  String DURATION = "duration";
  String STATUS = "status";
  String INFO = "info";
  String CONTEXT = "context";
  String TELEMETRY_EVENT_TYPE = "telemetryEventType";
  String PARAMS = "params";
  String API_ACCESS = "api_access";
  String FILTERS = "filters";
  String GROUP = "group";
  String UNAUTHORIZED = "Unauthorized";
  String MANAGED_FOR = "managedFor";
  String SUNBIRD_SSO_CLIENT_ID = "sunbird_sso_client_id";
  String SUNBIRD_SSO_CLIENT_SECRET = "sunbird_sso_client_secret";
  String SUNBIRD_SSO_PASSWORD = "sunbird_sso_password";
  String SUNBIRD_SSO_RELAM = "sunbird_sso_realm";
  String SUNBIRD_SSO_URL = "sunbird_sso_url";
  String SUNBIRD_SSO_USERNAME = "sunbird_sso_username";
  String SSO_CLIENT_ID = "sso.client.id";
  String SSO_CLIENT_SECRET = "sso.client.secret";
  String SSO_PASSWORD = "sso.password";
  String SSO_POOL_SIZE = "sso.connection.pool.size";
  String SSO_PUBLIC_KEY = "sunbird_sso_publickey";
  String SSO_REALM = "sso.realm";
  String SSO_URL = "sso.url";
  String SSO_USERNAME = "sso.username";
  String MESSAGE_ID = "X-msgId";
  String ANONYMOUS = "Anonymous";
  List<String> USER_UNAUTH_STATES =
    Arrays.asList(JsonKey.UNAUTHORIZED, JsonKey.ANONYMOUS);
  String IS_AUTH_REQ = "isAuthReq";
  String SUNBIRD_HEALTH_CHECK_ENABLE = "sunbird_health_check_enable";
  String HEALTH = "health";
  String REQUEST = "request";
  String IS_SSO_ENABLED = "sso.enabled";
  String PARENT_ID = "parentId";
  String SUB = "sub";
  String DOT_SEPARATOR = ".";
  String SHA_256_WITH_RSA = "SHA256withRSA";
  
}
