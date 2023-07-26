package app.planet.domain.exception;

import app.planet.core.exception.BusinessException;

import static app.planet.core.constant.ExceptionConstant.ExceptionCodes.INVALID_USER_INFO_EXCEPTION;

public class InvalidChannelInfoInfoException extends BusinessException {
    public InvalidChannelInfoInfoException() {
        super(INVALID_USER_INFO_EXCEPTION);
    }
}
