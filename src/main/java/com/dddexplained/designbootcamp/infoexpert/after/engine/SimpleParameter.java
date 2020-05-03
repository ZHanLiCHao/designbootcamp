package com.dddexplained.designbootcamp.infoexpert.after.engine;

import javax.servlet.http.HttpServletRequest;

public class SimpleParameter implements Parameter {

    private Object[] value;

    @Override
    public String getName() {
        return null;
    }

    public void setValue(String[] value) {
        this.value = value;
    }

    @Override
    public void fill(HttpServletRequest request) {
        SimpleParameter simplePara = this;
        String[] values = request.getParameterValues(simplePara.getName());
        simplePara.setValue(values);
    }
}
