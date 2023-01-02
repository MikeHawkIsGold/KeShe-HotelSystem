<script setup>
import { reactive } from "vue";
import { login } from "../api/login.js";

const formData = reactive({
  userName: "",
  pwd: "",
});
function loginClick(data) {
  const res = login(JSON.stringify(data));
  res.then((res) => {
    console.log(res);
  });
}
</script>

<template>
  <div id="page" class="site">
    <div class="container">
      <div class="login">
        <div class="hero">
          <h1>请 登 录 <br />以使用系统</h1>
          <p>
            如果您没有账号，<br />
            请联系系统管理员
          </p>
        </div>
        <div class="main">
          <el-form :model="formData" class="login-form">
            <p>
              <el-form-item>
                <input
                  type="text"
                  v-model="formData.userName"
                  placeholder="输入您的账号"
                />
              </el-form-item>
            </p>
            <p class="password">
              <el-form-item>
                <input
                  type="password"
                  v-model="formData.pwd"
                  show-password
                  placeholder="输入您的密码"
              /></el-form-item>
            </p>
            <p>
              <el-form-item
                ><input
                  type="button"
                  class="submit"
                  @click="loginClick(formData)"
                  value="登录"
              /></el-form-item>
            </p>
          </el-form>
        </div>
      </div>
    </div>
  </div>
</template>

<style scoped>
@import "../assets/loginPage.css";
</style>
