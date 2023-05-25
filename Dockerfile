FROM deepjavalibrary/djl-serving

SHELL ["/bin/bash", "-c"]
ENV SHELL=/bin/bash
RUN apt-get update
RUN apt-get install zip
RUN apt-get install unzip
RUN curl -s "https://get.sdkman.io" | bash
RUN chmod a+x "$HOME/.sdkman/bin/sdkman-init.sh"
RUN source "/root/.sdkman/bin/sdkman-init.sh"
# RUN sdk install scala 3.2.2 -y
COPY . .
# RUN sdk install sbt
# RUN sdk install java 22.2.r17-grl -y''



CMD ["sbt", "run"]