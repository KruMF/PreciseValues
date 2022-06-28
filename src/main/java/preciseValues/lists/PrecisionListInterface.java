package preciseValues.lists;

import preciseValues.errorModel.ErrorType;
import preciseValues.errorModel.NumberError;
import preciseValues.number.PreciseNumber;

import java.math.BigDecimal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//TODO: add javadoc
interface PrecisionListInterface {
    PreciseNumber getAverage(@Nullable ErrorType errorType);
    BigDecimal getAverage();
    @NotNull NumberError getError(@Nullable ErrorType errorType);
}