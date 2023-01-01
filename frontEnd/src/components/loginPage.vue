<script setup></script>

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
          <form action="">
            <p>
              <input type="text" placeholder="输入您的账号" />
            </p>
            <p class="password">
              <input type="password" show-password placeholder="输入您的密码" />
            </p>
            <p>
              <input type="submit" class="submit" value="登录" />
            </p>
          </form>
        </div>
      </div>
    </div>
  </div>
</template>

<style scoped>
@import "../assets/loginPage.css";
</style>
