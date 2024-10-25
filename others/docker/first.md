<!--^ docker ps (-a) -->
<!--* List all running containers -->
<!--~ Use the "-a" flag to list all containers, including stopped ones -->

<!--^ docker run (-p "___:__") (-d) "___" -->
<!--* Run a container (if not found locally, it will be pulled from the registry) -->
<!--! It creates a new container from the image every time it is run -->
<!--~ The "-p" flag maps a port on the host to a port on the container -->
<!--~ The "-d" flag runs the container in detached mode -->

<!--^ docker images -->
<!--* List all images on your machine -->

<!--^ docker pull "___" -->
<!--* Pull an image from the registry (Docker Hub) -->

<!--^ docker inspect "___" -->
<!--* Display detailed information about an object (container, image, etc.) -->

<!--^ docker port "___" -->
<!--* Display the public-facing port of a container -->

<!--^ docker exec -it "___" "___" -->
<!--* Run a command in a running container -->

<!--^ docker start "___" -->
<!--* Start a stopped container -->

<!--^ docker stop "___" -->
<!--* Stop a running container -->

<!--^ docker restart "___" -->
<!--* Restart a container -->
