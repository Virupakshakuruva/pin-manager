package com.docomo.pinmanager.exceptions;

/**
 * @author virupaksha.kuruva
 *
 */
public class ErrorInfo {

    private String errorMessage;
    private int errorCode;

    public ErrorInfo(String errorMessage, int errorCode) {
        this.errorMessage = errorMessage;
        this.errorCode = errorCode;
    }

    public ErrorInfo() {
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

}
