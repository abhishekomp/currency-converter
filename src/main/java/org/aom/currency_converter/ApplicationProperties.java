package org.aom.currency_converter;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties(prefix = "app")
@Validated
public class ApplicationProperties {

    private final String version;
    private final OpenExchange openExchange;

    public ApplicationProperties(String version, OpenExchange openExchange) {
        this.version = version;
        this.openExchange = openExchange;
    }

    public String getVersion() {
        return version;
    }

    public OpenExchange getOpenExchange() {
        return openExchange;
    }

    @Override
    public String toString() {
        return "ApplicationProperties{" +
                "version='" + version + '\'' +
                ", openExchange=" + openExchange +
                '}';
    }
    public static class OpenExchange{
        @NotEmpty
        private final String url;
        private final String token;
        @Positive
        private final int port;

        public String getUrl() {
            return url;
        }

        public String getToken() {
            return token;
        }

        public int getPort() {
            return port;
        }
        public OpenExchange(String url, String token, int port) {
            this.url = url;
            this.token = token;
            this.port = port;
        }

        @Override
        public String toString() {
            return "OpenExchange{" +
                    "url='" + url + '\'' +
                    ", token='" + token + '\'' +
                    ", port=" + port +
                    '}';
        }
    }


}
