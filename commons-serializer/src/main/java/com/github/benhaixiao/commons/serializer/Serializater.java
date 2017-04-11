package com.github.benhaixiao.commons.serializer;

import java.io.Serializable;

public interface Serializater {
	
	public byte[] serialize(final Serializable obj);

	public <T> T deserialize(final byte[] objectData);
	
}
