FROM node:20-alpine AS build

WORKDIR /usr/src/app

COPY . .

RUN yarn

EXPOSE 4200
CMD [ "yarn", "start" ]
