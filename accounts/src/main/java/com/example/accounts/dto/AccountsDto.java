package com.example.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Schema(
        name = "Accounts",
        description = "schema to hold account information"
)
@Data
public class AccountsDto {

    @Schema(description = "Account number of the customer", example = "1234567890")
    @NotEmpty(message = "AccountNumber cannot be a null or Empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "AccountNumber must be 10 digits")
    private Long accountNumber;

    @Schema(description = "Account type of the customer", example = "Savings")
    @NotEmpty(message = "AccountType cannot be a null or Empty")
    private String accountType;

    @Schema(description = "branch address of bank", example = "123 NewYork")
    @NotEmpty(message = "BranchAddress cannot be a null or Empty")
    private String branchAddress;
}
