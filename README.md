web-security-tools
==================

Scripts and resources used for my talk about web-security

###Content###

#####WebGoat#####
Deliberately insecure J2EE web application designed to teach web application security concepts
https://code.google.com/p/webgoat/source/checkout

#####php-taint#####
Taint is a PHP extension, used for detecting XSS codes

#####xsssniper#####
An automatic XSS discovery tool http://brindi.si/g/

#####webscarab#####
https://github.com/OWASP/OWASP-WebScarab

###Installation###
Clone the repository and initialize the submodules

```
# Initialize the repository
git clone git@github.com:tomasperezv/web-security-tools.git
git submodule update --init

# For running web-goat is required java
sudo add-apt-repository ppa:webupd8team/java
sudo apt-get update
sudo apt-get install oracle-java7-installer

# For running web-goat is required java
# sudo apt-get install openjdk-7-jre-headless
# so switch in case is needed
sudo update-alternatives --config java

# Launch webgoat server
cd web-security-tools/webgoat
sh webgoat.sh start8080
# Now you can open webgoat in your browser: http://127.0.0.1:8080/webgoat/attack&#8221

# Launch webscarab
sh web-security-tools/webscarab/start.sh
```
