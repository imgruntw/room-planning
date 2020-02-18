# room-planning

- mvn quarkus:dev
- mvn package -Pnative -Dquarkus.native.container-build=true
- docker build -f src/main/docker/Dockerfile.native -t quarkus/room-planning .
- docker run -i --rm -p 8080:8080 quarkus/room-planning
- winpty docker exec -it <ID> bash
- readelf -h application
