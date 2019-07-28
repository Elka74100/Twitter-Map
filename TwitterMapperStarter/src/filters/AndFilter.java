package filters;

import twitter4j.Status;

import java.util.List;

public class AndFilter implements Filter {


    public AndFilter() {
    }

    @Override
    public boolean matches(Status s) {
        return false;
    }

    @Override
    public List<String> terms() {
        return null;
    }
}
