package com.example.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
@Schema(
    name = "Customer",
    description = "schema to hold customer and account details"
)
public class CustomerDto {

    @Schema(description = "name of the customer", example = "Mahshad")
    @NotEmpty(message = "Name Cannot be a null or empty")
    @Size(min = 5, max = 30, message = "Name must be between 5 and 30 characters")
    private String name;

    @Schema(description = "email of the customer", example = "G5IhM@example.com")
    @NotEmpty(message = "Email cannot be a null or empty")
    @Email(message = "Please enter a valid email address")
    private String email;

    @Schema(description = "mobile number of the customer", example = "1234567890")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    private String mobileNumber;

    @Schema(description = "account details of the customer")
    private AccountsDto accountsDto;
}
