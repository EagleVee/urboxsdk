import com.urbox.utils.UrboxConfig;

public class AppUrboxLib {

    private static AppUrboxLib instance;

    // Action: Payment
    String action = "";
    String actionType = "";

    int environment = 0;

    public static AppUrboxLib getInstance() {
        if (instance == null) {
            instance = new AppUrboxLib();
        }

        return instance;
    }

    public String setActionType(Enum _actionType) {
        if (_actionType.equals(ACTION.PAYMENT)) {
            actionType = UrboxConfig.ACTION_PAYMENT;
        } else {
            actionType = UrboxConfig.ACTION_TYPE_PAYMENT;
        }

        return actionType;
    }

    public int setEnvironment(Enum _environment) {
        if (_environment.equals(ENVIRONMENT.DEBUG)) {
            environment = UrboxConfig.ENVIRONMENT_DEBUG;
        } else if (_environment.equals(ENVIRONMENT.DEVELOPMENT)) {
            environment = UrboxConfig.ENVIRONMENT_DEVELOPER;
        } else if (_environment.equals(ENVIRONMENT.PRODUCTION)) {
            environment = UrboxConfig.ENVIRONMENT_PRODUCTION;
        } else {
            environment = UrboxConfig.ENVIRONMENT_DEBUG;
        }
        return environment;
    }
}

public enum ACTION {
    MAP,
    PAYMENT
}

//todo enum choose environment
public enum ENVIRONMENT {
    DEBUG,
    DEVELOPMENT,
    PRODUCTION
}

//todo enum action type
public enum ACTION_TYPE {
    GET_TOKEN,
    LINK
}