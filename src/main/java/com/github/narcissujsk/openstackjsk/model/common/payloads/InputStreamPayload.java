package com.github.narcissujsk.openstackjsk.model.common.payloads;

import java.io.IOException;
import java.io.InputStream;

import com.github.narcissujsk.openstackjsk.model.common.Payload;

/**
 * Input Stream Payload
 * 
 * @author Jeremy Unruh
 */
public class InputStreamPayload implements Payload<InputStream>{

	private InputStream is;
	
	public InputStreamPayload(InputStream is) {
		this.is = is;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void close() throws IOException {
		if (is != null)
			is.close();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InputStream open() {
		return is;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void closeQuietly() {
		  try {
				close();
			}
			catch (IOException e) {
			}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InputStream getRaw() {
		return is;
	}

}
