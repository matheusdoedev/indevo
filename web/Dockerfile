FROM node:20-alpine AS build

WORKDIR /usr/src/app

COPY . .

RUN yarn

EXPOSE 3000
CMD [ "yarn", "dev" ]
