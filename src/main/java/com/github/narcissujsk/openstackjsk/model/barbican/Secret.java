package com.github.narcissujsk.openstackjsk.model.barbican;

import com.github.narcissujsk.openstackjsk.common.Buildable;
import com.github.narcissujsk.openstackjsk.model.ModelEntity;
import com.github.narcissujsk.openstackjsk.model.barbican.builder.SecretCreateBuilder;

import java.util.Date;
import java.util.Map;

/**
 * Created by reneschollmeyer on 02.08.17.
 */
public interface Secret extends ModelEntity, Buildable<SecretCreateBuilder> {

    /**
     * @return algorithm.
     */
    String getAlgorithm();

    /**
     * @return bit length of the secret. Must be greater than zero.
     */
    Integer getBitLength();

    /**
     * @return content type of the secret.
     */
    Map<String, String> getContentTypes();

    /**
     * @return system generated creation time.
     */
    Date getCreateTime();

    /**
     * @return system generated last update time.
     */
    Date getUpdateTime();

    /**
     * @return user uuid of the creator of this secret.
     */
    String getCreatorId();

    /**
     * @return expiration of the secret.
     */
    Date getExpiration();

    /**
     * @return mode of the secret.
     */
    String getMode();

    /**
     * @return name of the secret.
     */
    String getName();

    /**
     * @return URL reference to the secret.
     */
    String getSecretReference();

    /**
     * @return secret type.
     */
    String getSecretType();

    /**
     * @return current status of the secret.
     */
    String getStatus();

    /**
     * @return stored secret data.
     */
    String getPayload();

    /**
     * @return content type of the secret data.
     */
    String getPayloadContentType();

    /**
     * @return encoding used for the data.
     */
    String getPayloadContentEncoding();
}
