Necessário para contribuir no código:
IDE para Java como Apache NetBeans, VS Code, Eclipse e etc;
pgAdmin 4;
postgresql-42.7.14.jar;
JavaFX SDK kit.

Instruções para instalação:
NetBeans:
flatpak install flathub org.apache.netbeans

pgAdmin 4:
flatpak install flathub org.pgadmin.pgadmin4

Postgresql Connector:
wget https://jdbc.postgresql.org/download/postgresql-42.7.14.jar

JavaFX SDK kit caso JDK for versão 21 (cheque com "java -version" no terminal):
cd Downloads/
wget https://download2.gluonhq.com/openjfx/21.0.13/openjfx-21.0.13_linux-x64_bin-sdk.zip
unzip openjfx-21.0.13_linux-x64_bin-sdk.zip
Após isso, adicione a pasta lib em javafx-sdk-21.0.13 à sua Java Platform no NetBeans. Com a IDE aberta vá em Tools > Java Platforms > Sources > Add JAR/Folder e selecione a pasta lib dentro da pasta extraída.

