web-security-tools
==================

Scripts and resources used for my talk about web-security

Don’t write your own security controls! 
Reinventing the wheel when it comes to developing security controls for every web application or web service leads to wasted time and massive security holes.

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

# php-taint requires php and pear
sudo apt-get install php5-cli php-pear
sudo pear install taint

# For running web-goat is required java openjdk
# sudo apt-get install openjdk-7-jre-headless
# so switch in case is needed
sudo update-alternatives --config java

# xsssniper requires the module mechanize
sudo apt-get install python-pip
sudo pip install mechanize

# Install and launch Nessus, you will need an activation code: http://www.tenable.com/products/nessus-home
sudo dpkg -i web-security-tools/nessus/Nessus-5.2.5-debian6_amd64.deb
sudo /etc/init.d/nessusd start

# Launch webgoat server
cd web-security-tools/webgoat
sh webgoat.sh start8080
# Now you can open webgoat in your browser: http://127.0.0.1:8080/webgoat/attack&#8221

# Launch webscarab
sh web-security-tools/webscarab/start.sh

# w3af requires several modules and packages
sudo apt-get instal w3af
# build and install c-algorithms
cd web-security-tools/c-algorithms && ./configure && ./make
sudo make install
sudo apt-get install graphviz python2.7-dev libsqlite3-dev libxslt1-dev python-gtksourceview2 libxml2-dev python-pdfminer python-webkit
sudo pip install pybloomfilter
sudo pip install --pre clamd PyGithub GitPython pybloomfiltermmap esmre nltk pdfminer futures scapy-real guess-language cluster msgpack-python python-ntlm xdot

# Install thc-hydra
cd ./web-security/thc-hydra
./configure && make
sudo make install

# Launch w3af
./web-security-tools/w3af/w3af_gui

# If you want to add passwords to w3af, you can do it at:
# /usr/share/w3af/core/controllers/bruteforce
```
