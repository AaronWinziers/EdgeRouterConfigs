/* Config for our isolated Router2 */
interfaces {
    ethernet eth0 {
        address 192.168.1.1/24
        duplex auto
        ipv6 {
            address {
                autoconf
            }
            dup-addr-detect-transmits 1
        }
        speed auto
    }
    ethernet eth1 {
        address ::1001/128
        duplex auto
        ipv6 {
            address {
                autoconf
            }
            dup-addr-detect-transmits 1
        }
        speed auto
    }
    ethernet eth2 {
        duplex auto
        speed auto
    }
    loopback lo {
    }
}
service {
    gui {
        http-port 80
        https-port 443
        older-ciphers enable
    }
    ssh {
        port 22
        protocol-version v2
    }
}
system {
    host-name ubnt
    login {
        user ubnt {
            authentication {
                encrypted-password $1$zKNoUbAo$gomzUbYvgyUMcD436Wo66.
            }
            level admin
        }
    }
    ntp {
        server 0.ubnt.pool.ntp.org {
        }
        server 1.ubnt.pool.ntp.org {
        }
        server 2.ubnt.pool.ntp.org {
        }
        server 3.ubnt.pool.ntp.org {
        }
    }
    syslog {
        global {
            facility all {
                level notice
            }
            facility protocols {
                level debug
            }
        }
    }
    time-zone UTC
}


/* Warning: Do not remove the following line. */
/* === vyatta-config-version: "config-management@1:conntrack@1:cron@1:dhcp-relay@1:dhcp-server@4:firewall@5:ipsec@5:nat@3:qos@1:quagga@2:system@4:ubnt-pptp@1:ubnt-util@1:vrrp@1:webgui@1:webproxy@1:zone-policy@1" === */
/* Release version: v1.9.1.4939093.161214.0705 */
