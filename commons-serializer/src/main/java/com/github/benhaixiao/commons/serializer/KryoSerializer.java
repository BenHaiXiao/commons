package com.github.benhaixiao.commons.serializer;

import java.io.Serializable;

import com.github.benhaixiao.commons.serializer.kryo.KryoUtils;

public class KryoSerializer implements Serializater{
	
	private KryoUtils kryoUtils;
	
	@Override
	public byte[] serialize(Serializable obj) {
		return kryoUtils.kryoSerialize(obj);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T deserialize(byte[] objectData) {
		return (T) kryoUtils.kryoDeserialize(objectData);
	}

	public void setKryoUtils(KryoUtils kryoUtils) {
		this.kryoUtils = kryoUtils;
	}

}
