package com.pse.tixclick.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

@Getter
public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized error", HttpStatus.INTERNAL_SERVER_ERROR),
    INVALID_KEY(1001, "Invalid key", HttpStatus.BAD_REQUEST),
    USER_EXISTED(1002, "User existed", HttpStatus.BAD_REQUEST),
    USERNAME_INVALID(1003, "Username must be at least {min} characters", HttpStatus.BAD_REQUEST),
    INVALID_PASSWORD(1004, "Password must be at least {min} characters", HttpStatus.BAD_REQUEST),
    USER_NOT_EXISTED(1005, "Tài khoản không tồn tại", HttpStatus.NOT_FOUND),
    UNAUTHENTICATED(1006, "Mật khẩu không hợp lệ", HttpStatus.UNAUTHORIZED),
    UNAUTHORIZED(1007, "You do not have permission", HttpStatus.FORBIDDEN),
    INVALID_DOB(1008, "Your age must be at least {min}", HttpStatus.BAD_REQUEST),
    PASSWORD_NOT_CORRECT(1009, "Incorrect password", HttpStatus.UNAUTHORIZED),
    EMAIL_TAKEN(1010, "Email already in use", HttpStatus.BAD_REQUEST),
    EMPTY_FIELD(1011, "You cannot leave required field(s) empty", HttpStatus.BAD_REQUEST),
    ITEM_NOT_FOUND(1012, "Item not found", HttpStatus.NOT_FOUND),
    PHONE_TAKEN(1013, "Phone number already in use", HttpStatus.BAD_REQUEST),
    INVALID_TOKEN(1014, "Token không hợp lệ", HttpStatus.BAD_REQUEST),
    EMAIL_NOT_EXISTED(1015, "Email not existed", HttpStatus.NOT_FOUND),
    ID_EXISTED(1016, "Id already exists", HttpStatus.BAD_REQUEST),
    ID_NOT_MATCHED(1017, "Id does not match request", HttpStatus.BAD_REQUEST),
    POST_CATEGORY_NOT_FOUND(1018, "Post category not found", HttpStatus.NOT_FOUND),
    INVALID_REFRESH_TOKEN(1019, "Invalid refresh token", HttpStatus.BAD_REQUEST),
    INVALID_EMAIL(1020, "Invalid email", HttpStatus.BAD_REQUEST),
    INVALID_EMAIL_FORMAT(1021, "Invalid email format", HttpStatus.BAD_REQUEST),
    ROLE_NOT_EXISTED(1022, "Role not existed", HttpStatus.NOT_FOUND),
    USER_ACTIVE(1023, "User is active", HttpStatus.BAD_REQUEST),
    GITHUB_ERROR(1024, "Lỗi Đăng nhập Github", HttpStatus.BAD_REQUEST),
    ;

    ErrorCode(int code, String message, HttpStatusCode statusCode) {
        this.code = code;
        this.message = message;
        this.statusCode = statusCode;
    }

    private final int code;
    private final String message;
    private final HttpStatusCode statusCode;
}
