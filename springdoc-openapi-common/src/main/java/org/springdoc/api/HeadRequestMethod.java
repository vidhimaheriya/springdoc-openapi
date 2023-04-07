package org.springdoc.api;

import io.swagger.v3.oas.models.Operation;
import io.swagger.v3.oas.models.PathItem;

public class HeadRequestMethod extends RequestMethodHandler{
    @Override
    public void execute(Operation operation, PathItem pathItemObject) {
        pathItemObject.head(operation);
    }
}