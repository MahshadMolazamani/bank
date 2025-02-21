package com.example.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Schema(name = "ErrorResponse", description = "schema to hold Error Response information")
@Data
@AllArgsConstructor
public class ErrorResponseDto {
    @Schema(description = "path of the api")
    private String apiPath;

    @Schema(description = "status code of the response")
    private HttpStatus errorCode;

    @Schema(description = "status message of the response")
    private String errorMessage;

    @Schema(description = "time when the error occurred")
    private LocalDateTime errorTime;
}
