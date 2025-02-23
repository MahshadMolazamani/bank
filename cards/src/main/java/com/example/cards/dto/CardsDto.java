package com.example.cards.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Schema(name = "Cards", description = "Schema to hold card information")
@Data
public class CardsDto {
    @NotEmpty(message = "Mobile Number cannot be a null or Empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile Number must be 10 digits")
    @Schema(description = "Mobile Number of the customer", example = "1234567890")
    private String mobileNumber;

    @NotEmpty(message = "Card Number cannot be a null or Empty")
    @Pattern(regexp = "(^$|[0-9]{12})", message = "Card Number must be 12 digits")
    @Schema(description = "Card Number of the customer", example = "1234567890")
    private String cardNumber;

    @NotEmpty(message = "Card Type cannot be a null or Empty")
    @Schema(description = "Card Type of the customer", example = "Credit Card")
    private String cardType;

    @Positive(message = "Total Limit must be a positive number")
    @Schema(description = "Total Limit of the card", example = "10000")
    private int totalLimit;

    @PositiveOrZero(message = "Total amount used should be equal or greater than zero")
    @Schema(
            description = "Total amount used by a Customer", example = "1000"
    )
    private int amountUsed;

    @PositiveOrZero(message = "Total available amount should be equal or greater than zero")
    @Schema(
            description = "Total available amount against a card", example = "90000"
    )
    private int availableAmount;
}
