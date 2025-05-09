package com.josdem.gmail.service;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.http.javanet.NetHttpTransport;

import java.io.IOException;

public interface GmailService {
    Credential getCredentials(final NetHttpTransport HTTP_TRANSPORT) throws IOException;
}
