package com.jaspersoft.cli.tool.api.operation;

import com.jaspersoft.jasperserver.dto.resources.ClientResource;
import com.jaspersoft.jasperserver.jaxrs.client.apiadapters.importexport.importservice.ImportParameter;

import java.io.File;
import java.io.InputStream;
import java.util.Map;

/**
 * @author Alexander Krasnyanskiy
 */
public interface ClientOperation {

    ClientResource getResource(String uri);
    void importResource(InputStream resource);
    void importResource(InputStream resource, Map<ImportParameter, Boolean> parameters);
    void importResource(File resource);

}
