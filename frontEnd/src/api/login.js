import request from "./request";

export const login = () => {
  request.get("/user").then((res) => {
    console.log(res);
  });
};
