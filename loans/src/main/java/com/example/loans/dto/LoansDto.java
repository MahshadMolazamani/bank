package com.example.loans.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Data
public class LoansDto {
    @NotEmpty(message = "MobileNumber cannot be a null or Empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile Number must be 10 digits")
    private String mobileNumber;

    @NotEmpty(message = "LoanNumber cannot be a null or Empty")
    @Pattern(regexp = "(^$|[0-9]{12})", message = "Loan Number must be 12 digits")
    private String loanNumber;

    @NotEmpty(message = "LoanType cannot be a null or Empty")
    private String loanType;

    @Positive(message = "TotalLoan must be a positive number")
    private int totalLoan;

    @PositiveOrZero(message = "AmountPaid must be a positive number ir equal to zero")
    private int amountPaid;

    @PositiveOrZero(message = "Total outstanding amount should be equal or greater than zero")
    private int outstandingAmount;
}
