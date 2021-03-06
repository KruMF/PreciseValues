package preciseValues.lists;

import preciseValues.errorModel.NumberError;
import preciseValues.preciseNumber.PreciseNumber;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.math.BigDecimal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//TODO: finish this and add javadoc
public class PrecisionList extends AbstractPrecisionList {
    public List<PreciseNumber> members;

    public PrecisionList(@Nullable ArrayList<PreciseNumber> members) {
        this.members = Objects.requireNonNullElse(members, new ArrayList<>());
    }

    //prevents further overriding
    @Override
    public final @NotNull BigDecimal getAverage() {
        return super.getAverage();
    }

    @Override
    public final int getMemberCount() {
        return members.size();
    }

    @Override
    public final @NotNull BigDecimal getMemberSum() {
        BigDecimal sum = new BigDecimal(0);
        for (PreciseNumber member : members) {
            sum = sum.add(member.getValue());
        }
        return sum;
    }

    @Override
    public @NotNull NumberError getAbsoluteError() {
        //TODO: finish this
        System.err.println("Unfinished functionality:" + "\n"
                + "PrecisionList.getAbsoluteError() returns null, where annotated as not-null!");
        return null;
    }

    @Override
    public @NotNull NumberError getRelativeError() {
        //TODO: finish this
        System.err.println("Unfinished functionality:" + "\n"
                + "PrecisionList.getRelativeError() returns null, where annotated as not-null!");
        return null;
    }
}