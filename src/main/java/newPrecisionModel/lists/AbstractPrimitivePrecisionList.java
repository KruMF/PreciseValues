package newPrecisionModel.lists;

import newPrecisionModel.errorModel.NumberError;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.math.BigDecimal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class AbstractPrimitivePrecisionList extends AbstractPrecisionList {
    public List<Double> members;

    public AbstractPrimitivePrecisionList(@Nullable List<Double> members) {
        this.members = Objects.requireNonNullElse(members, new ArrayList<>());
    }

    @Override
    public final int getMemberCount() {
        return members.size();
    }

    @Override
    public @NotNull BigDecimal getMemberSum() {
        return null;
    }

    @Override
    public abstract @NotNull NumberError getAbsoluteError();

    @Override
    public abstract @NotNull NumberError getRelativeError();
}