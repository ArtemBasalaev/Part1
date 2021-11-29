package lesson12;

public class ServerName {
    public static void main(String[] args) {
        String url = "http://server.ru/abcd/dfdf.htm?dfdf=dfdf";

        String serverName = getServerName(url);
        System.out.printf("В url:%s указан сервер: %s", url, serverName);
    }

    public static String getServerName(String url) {
        int serverNameFirstSymbolIndexInUrl = url.indexOf("://") + 3;
        int serverNameLastSymbolIndexInUrl = url.indexOf('/', serverNameFirstSymbolIndexInUrl);

        if (serverNameLastSymbolIndexInUrl == -1) {
            serverNameLastSymbolIndexInUrl = url.length();
        }

        return url.substring(serverNameFirstSymbolIndexInUrl, serverNameLastSymbolIndexInUrl);
    }
}