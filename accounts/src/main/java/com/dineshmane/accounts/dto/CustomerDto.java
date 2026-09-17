package com.dineshmane.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold Customer and Account information"
)
public class CustomerDto {

    @NotEmpty(message = "Name can not be null or empty")
    @Size(min = 5, max = 30, message = "The length of the customer name should be between 5 and 30 chars")
    @Schema(
            description = "Name of the Customer",
            example = "Dinesh Mane"
    )
    private String name;

    @NotEmpty(message = "Email can not be null or empty")
    @Email(message = "Email address should be valid value")
    @Schema(
            description = "Email address of the Customer",
            example = "dinesh@gmail.com"
    )
    private String email;

    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    @Schema(
            description = "Mobile Number of the Customer",
            example = "9725640255"
    )
    private String mobileNumber;

    @Schema(
            description = "Account Details of the Customer"
    )
    private AccountsDto accountsDto;

}
