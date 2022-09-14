package br.com.alura.loja.http;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

/**
 * Implementacao do Adapter
 */
public class JavaHttpClient implements  HttpAdapter{

    //O codigo em si nao importa
    @Override
    public void post(String url, Map<String, Object> dados) {
        try {
            URL urlDaApi = new URL(url);
            URLConnection urlConnection = urlDaApi.openConnection();
            urlConnection.connect();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao enviar requisicao HTTP ", e);
        }
    }
}
