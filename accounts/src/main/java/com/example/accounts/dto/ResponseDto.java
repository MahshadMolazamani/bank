package com.example.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Schema(name = "ResponseDto", description = "schema to hold a success response")
@Data
@AllArgsConstructor
public class ResponseDto {
    @Schema(description = "status code of the response")
    private String statusCode;
    @Schema(description = "status message of the response")
    private String statusMsg;
}
