package filters;

import twitter4j.Status;

import java.util.List;

public class OrFilter implements Filter{

    public OrFilter() {
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
