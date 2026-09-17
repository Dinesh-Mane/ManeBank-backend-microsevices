package com.dineshmane.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDto {

    @NotEmpty(message = "AccountNumber can not be null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "AccountNumber must be 10 digits")
    @Schema(
            description = "10 digit Account number of your ManeBank Account",
            example = "9725265526"
    )
    private Long accountNumber;

    @Schema(
            description = "Account type of your ManeBank Account",
            example = "Savings"
    )
    @NotEmpty(message = "AccountType can not be null or empty")
    private String accountType;

    @NotEmpty(message = "BranchAddress can not be null or empty")
    @Schema(
            description = "ManeBank branch address",
            example = "Hinjewadi Phase 3, Pune"
    )
    private String branchAddress;

}
