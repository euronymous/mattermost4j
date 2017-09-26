/*
 * @(#) net.bis5.mattermost.client4.api.SamlApi
 * Copyright (c) 2017 Maruyama Takayuki
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * 	Unless required by applicable law or agreed to in writing, software
 * 	distributed under the License is distributed on an "AS IS" BASIS,
 * 	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 	See the License for the specific language governing permissions and
 * 	limitations under the License.
 */
package net.bis5.mattermost.client4.api;

import java.nio.file.Path;

import net.bis5.mattermost.client4.ApiResponse;
import net.bis5.mattermost.model.SamlCertificateStatus;

/**
 * TODO 型の説明
 * 
 * @author Maruyama Takayuki
 * @since 2017/09/09
 */
public interface SamlApi {

	ApiResponse<String> getSamlMetadata();

	boolean uploadSamlIdpCertificate(Path dataFile, String fileName);

	boolean uploadSamlPublicCertificate(Path dataFile, String fileName);

	boolean uploadSamlPrivateCertificate(Path dataFile, String fileName);

	ApiResponse<Boolean> deleteSamlIdpCertificate();

	ApiResponse<Boolean> deleteSamlPublicCertificate();

	ApiResponse<Boolean> deleteSamlPrivateCertificate();

	ApiResponse<SamlCertificateStatus> getSamlCertificateStatus();
}