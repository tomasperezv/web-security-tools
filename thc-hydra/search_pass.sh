#./hydra-7.6/hydra -l users.txt -p passwords.txt localhost http -s 8080 -d
./hydra-7.6/hydra -L ../brute-force/users.txt -P ../brute-force/passwords.txt -t12 -f localhost http-head /webgoat/attack -V -t 10 -s 8080
