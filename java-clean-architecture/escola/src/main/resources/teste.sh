#!/bin/bash

while true; do

    read -p "Do you want to continue? [Y/n]: " yn

    case $yn in

        [Yy]* ) make install; break;;

        [Nn]* ) exit;;

        * ) echo "Please answer yes or no.";;

    esac

done
