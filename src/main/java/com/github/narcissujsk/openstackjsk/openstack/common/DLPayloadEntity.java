package com.github.narcissujsk.openstackjsk.openstack.common;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import com.github.narcissujsk.openstackjsk.core.transport.HttpResponse;
import com.github.narcissujsk.openstackjsk.model.common.DLPayload;

import com.google.common.io.ByteStreams;

/**
 * A Payload which encapsulates downstream data
 * 
 * @author Jeremy Unruh
 */
public class DLPayloadEntity implements DLPayload {

    private final HttpResponse response;

    private DLPayloadEntity(HttpResponse response) {
        this.response = response;
    }

    public static DLPayloadEntity create(HttpResponse response) {
        return new DLPayloadEntity(response);
    }

	@Override
	public HttpResponse getHttpResponse() {
		return response;
	}
	
    @Override
    public InputStream getInputStream() {
        return response.getInputStream();
    }

    @Override
    public void writeToFile(File file) throws IOException {
        checkNotNull(file);
        try(InputStream inputStream = response.getInputStream();
                FileOutputStream fileOutputStream = new FileOutputStream(file) ){
            ByteStreams.copy(inputStream, fileOutputStream);
        }
    }

}
